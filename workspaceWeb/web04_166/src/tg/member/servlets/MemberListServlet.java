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

public class MemberListServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 누군가가 만들어 놓은 템플릿을 사용한 것.
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // <- 사용할 JDBC 드라이버 : 
															// 드라이버 타입: @서버 주소와 포트번호 : 
															// db서비스 아이디
		String user = "jsp";
		String password = "jsp";

		String sql = "";
		try { 
			//1 JDBC 드라이버 등록 (오라클 폴더에서 jar 파일을 가져와야 한다. 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2 oracle 서버 연결
			conn = DriverManager.getConnection(url, user, password);
			//3 sql 수행 객체 준비 (sql 질의문을 쓸 수 있게 된다.)
			stmt = conn.createStatement();
			//4 sql문 수행 -> 데이터베이스에 sql문 전달
			sql = "SELECT MEMBERNO, MNAME, EMAIL, CRE_DATE";
			sql += " FROM MEMBERS";
			sql += " ORDER BY MEMBERNO ASC";
			//5 수행 결과 반환 : rs
			rs = stmt.executeQuery(sql);

			res.setContentType("text/html");
			res.setCharacterEncoding("UTF-8");

			PrintWriter out = res.getWriter();

			out.println("<html><head><title>회원목록</title></head>");
			out.println("<body><h1>회원목록</h1>");

			while (rs.next()) {
				out.println(
						rs.getInt("MEMBERNO") + "," + 
						rs.getString("MNAME") + "," + 
						rs.getString("EMAIL") + ","	+ 
						rs.getDate("CRE_DATE") + "<br/>"
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