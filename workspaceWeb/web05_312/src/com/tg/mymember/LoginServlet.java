package com.tg.mymember;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tg.member.MemberDto;


@WebServlet(value="/myauth/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
	
		HttpSession session = req.getSession();
		
		MyMemberDto myMemberDto = (MyMemberDto)session.getAttribute("myMember");
		
		if (myMemberDto == null) {
			RequestDispatcher rd = req.getRequestDispatcher("./MyLoginForm.jsp");
			rd.forward(req, res);
		}else {
			String contextPathStr = req.getContextPath() + "/myMember/list";
			res.sendRedirect(contextPathStr);
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "jsp";
		
		String sql = "";
		int colIndex = 1;
		
		String name = "";
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
						
			sql =  "SELECT MNAME, EMAIL";
			sql += " FROM MEMBERS";
			sql += " WHERE EMAIL = ?";
			sql += " AND PWD = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(colIndex++, email);
	        pstmt.setString(colIndex, pwd);
					
			rs = pstmt.executeQuery();
			System.out.println("쿼리 수행 성공");
			
//			res.setContentType("text/html");
//			res.setCharacterEncoding("UTF-8");
			
			if (rs.next()) {
				email = rs.getString("email");
				name = rs.getString("mname");
				pwd = rs.getString("pwd");
				
				//MyMemberDto myMemberDto = new MyMemberDto();
				MyMemberDto myMemberDto = new MyMemberDto(name, email, pwd);
				
//				myMemberDto.setEmail(email);
//				myMemberDto.setName(name);
				
				HttpSession session = req.getSession();
				session.setAttribute("myMember", myMemberDto);
				res.sendRedirect("../MyMember/list");
			}else {
				RequestDispatcher dispatcher =
						req.getRequestDispatcher("./MyLoginFail.jsp");
				
				dispatcher.forward(req, res);
			}
			
		} catch (Exception e) {
			// 예외처리 페이지로 위임
//			e.printStackTrace();
			req.setAttribute("error", e);
			RequestDispatcher dispatcher = 
					req.getRequestDispatcher("/error.jsp");
			
			dispatcher.forward(req, res);
		}
		
		finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // if(rs != null) end
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // finally end
	}
}