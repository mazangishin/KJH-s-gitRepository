package tg.member.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/member/one")
public class MemberOneServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		
		// DB 접속 준비
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "jsp";
		String sql = "";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // db 접속

			sql += "SELECT MEMBERNO, EMAIL, PWD, MNAME, CRE_DATE, MOD_DATE";
			sql += " FROM MEMBERS";
			sql += " WHERE EMAIL = ?";
			sql += " AND PWD = ?";// 수행할 쿼리문

			pstmt = conn.prepareStatement(sql); // sql문 검증. '' 를 절대로 넣지 말 것
			pstmt.setString(1, email); // 매개변수로 값 설정
			pstmt.setString(2, pwd);

			rs = pstmt.executeQuery(); // sql문 실행

			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8"); // 이인코오디잉
			PrintWriter out = res.getWriter(); // 출력이 된대요

			String htmlStr = "";

			out.println("<html><head><title>회원 한명 목록</title></head>");
			out.println("<body><h1>회원 한명 목록</h1>");
			
			htmlStr += "<div>";
			htmlStr += "<a href='./add'>신규 회원</a>";
			htmlStr += "</div>";
			htmlStr += "<br/>";
			
			out.println(htmlStr);
			
			while (rs.next()) {
				out.println(
						"<a href='./update?memberNo=" + rs.getInt("MEMBERNO") + "'>" +
						rs.getInt("MEMBERNO") + ", " + 
						rs.getString("MNAME") + ", " + 
						rs.getString("EMAIL") + ", " + 
						rs.getString("PWD") + ", " +
						rs.getDate("CRE_DATE") + "</a><br/>"
				);
			}
			out.println("</body></html>");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally { // 6 데이터베이스 객체 해제
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // if(rs != null) end

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // finally end

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
