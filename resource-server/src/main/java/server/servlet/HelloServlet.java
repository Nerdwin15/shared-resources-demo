package server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 168347322578347L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String data ="<!DOCTYPE html>" +
				"<html>" +
				"<head>" +
				"  <link rel='stylesheet' href='css/global.css' />" +
				"</head>" +
				"<body>" +
				"<h1> Hello world! </h1>" +
				"</body>" +
				"</html>";
		resp.getOutputStream().write(data.getBytes());
	}
}