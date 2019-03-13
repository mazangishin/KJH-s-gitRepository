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

public class ShowMemberListServlet extends GenericServlet {

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

			out.println("<html><head><style type=\"text/css\">\r\n" + 
					"	table {\r\n" + 
					"		border-collapse: collapse;\r\n" + 
					"		border: 1px solid black;\r\n" + 
					"	}\r\n" + 
					"</style><title>회원목록</title></head>");
			out.println("<body><div><h1>회원정보</h1><table>");

			while (rs.next()) {
				out.println(
						rs.getInt("MEMBERNO") + "," + 
						rs.getString("MNAME") + "," + 
						rs.getString("EMAIL") + ","	+ 
						rs.getString("PWD") + "," + 
						rs.getDate("CRE_DATE") + "," +
						rs.getDate("MOD_DATE") + "<br/>"
				);
			} // while end

			out.println("</tr></table></div></body></html>");
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