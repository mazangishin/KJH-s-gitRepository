package com.tg.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/auth/logout")
public class LogOut extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {

			doPost(req, res);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {

		//세션객체호출
		HttpSession session = req.getSession();
		//세션객체파기
		session.invalidate();
		
		res.sendRedirect("./login");
	
	}
	
}
