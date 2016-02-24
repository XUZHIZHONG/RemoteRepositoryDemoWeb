package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		System.out.println("name=" + name);
		String[] games = request.getParameterValues("game");
		String size = request.getParameter("size");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String method = request.getMethod();
		out.println("<h3>method:" + method + "</h3>");

		String uri = request.getRequestURI();
		out.println("<h3>uri:" + uri + "</h3>");

		out.println("<h3>name:" + name + "</h3>");
		out.println("<h3>size:" + size + "</h3>");
		if (games != null && games.length != 0) {
			for (int i = 0; i < games.length; i++) {
				out.println("<h3>games:" + games[i] + "</h3>");

			}

		}
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
