package register;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
* Servlet implementation class 
Register */
@WebServlet("/Register")
public class Register extends HttpServlet { 
private static final long serialVersionUID = 1L;
/**
* @see 
HttpServlet#HttpServlet() */
public Register() 
{ super();
// TODO Auto-generated constructor stub
}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
// TODO Auto-generated method stub
response.getWriter().append("Served at: ").append(request.getContextPath());
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse 
response) */
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
// TODO Auto-generated method stub
String uname = request.getParameter("uname");
String password = request.getParameter("password");
String email = request.getParameter("email");
Member user = new Member(uname, password, email);
RegisterDao rDao = new RegisterDao();
String result = rDao.insert(user);
response.getWriter().print(result);
}
}