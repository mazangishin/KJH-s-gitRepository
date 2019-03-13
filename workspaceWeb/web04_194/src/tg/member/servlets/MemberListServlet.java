package tg.member.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value="/member/list")
public class MemberListServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 누군가가 만들어 놓은 템플릿을 사용한 것.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  
		String user = "jsp";
		String password = "jsp";
		String sql = "";
		
		try { 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			sql = "SELECT MEMBERNO, EMAIL, PWD, MNAME, CRE_DATE, MOD_DATE";
			sql += " FROM MEMBERS";
			sql += " ORDER BY MEMBERNO ASC";
			
			rs = stmt.executeQuery(sql);

			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");

			PrintWriter out = res.getWriter();

			out.println("<html><head><title>회원목록</title></head>");
			out.println("<body><h1>회원정보</h1>");
			
			String htmlStr = "";
			
			htmlStr += "<div>";
			htmlStr += "<a href ='./add'>신규 회원</a>"; // 그 폴더의 /add servlet을 실행한다. 
			htmlStr += "</div>";
			htmlStr += "<br/>";
			
			out.print(htmlStr);

			while (rs.next()) {
				out.println(
						"<a href='./update?memberNo=" + rs.getInt("MEMBERNO") + "'>" +
						rs.getInt("MEMBERNO") + "," + 
						rs.getString("MNAME") + "," + 
						rs.getString("EMAIL") + ","	+ 
						rs.getDate("CRE_DATE") + "</a><br/>"
				);
			} // while end

			out.println("</body></html>");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally { //6 데이터베이스 객체 해제
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // if(rs != null) end

			if (stmt != null) {
				try {
					stmt.close();
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

}