package com.hudan.jk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoApi
 */
@WebServlet(name = "demoapi", urlPatterns = { "/demoapi" })
public class DemoApi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		String usernames=request.getParameter("u");
		String json="";
		if(usernames!=null && !usernames.equals(""))
		{
			 json="{\"status\":\"访问成功\"}";
		}else
		{
			 json="{\"status\":\"访问失败\",\"reason\":\"未传递参数u\"}";
		}
		PrintWriter out=response.getWriter();
		out.print(json);
		out.flush();
		
	}

}
