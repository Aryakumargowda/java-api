package test;
import java.io.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.lang.*;
//import jakarta.ws.rs.ApplicationPath;
//import jakarta.ws.rs.core.Application;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.QueryParam;
//import jakarta.ws.rs.core.MediaType;

@WebServlet("/login")
public class Login extends HttpServlet{
	
//	@Produces(MediaType.TEXT_HTML)
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws IOException{
			String pass="abcd";
			String status;
			response.setContentType("text/html");
			String un=request.getParameter("user");
			String password=request.getParameter("pass");
			PrintWriter out=response.getWriter();
			if(password==pass)
			{
				System.out.println(un+"login successfull");
				status="Login Successfull";
			}
			else
			{
				System.out.println(un+"login unsuccessfull");
				status="Login UnSuccessfull";
			}
			out.println("<DOCTYPE html>\n"+"<html>\n"+"<head><title>login</title></head>\n"+
			"<body bgcolor=grey><h1>"+un+" "+status+"</h1>\n"+"</body></html>");
		}
		
	}
