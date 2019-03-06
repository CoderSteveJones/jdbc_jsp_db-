package com.ym.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ym.dao.StudentDao;
import com.ym.dao.UserDao;
import com.ym.dao.imp.StudentDaoImp;
import com.ym.dao.imp.UserDaoImp;
import com.ym.domain.Student;
import com.ym.util.JDBCUtil;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		System.out.println("get调用了");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username =" + username + "password =" + password);		
		
		UserDao dao = new UserDaoImp();
		if(dao.login(username, password)) {
			response.getWriter().write("登录成功");
			
			StudentDao stuDao = new StudentDaoImp();
			List<Student> list = stuDao.findAll();
			System.out.println(list.size());
			request.getSession().setAttribute("list", list);
			
			response.sendRedirect("student_list.jsp");
		}else {
			response.getWriter().write("登录失败");
		}
		
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
