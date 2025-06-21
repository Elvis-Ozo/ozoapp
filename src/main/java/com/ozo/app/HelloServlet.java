package com.ozo.app;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException {
    res.setContentType("text/html");
    res.getWriter().println("<h1>Hello from ozoapp in Dockerized Tomcat 10!</h1>");
  }
}
