package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CalculatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CalculatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();  
		 float n1 = Float.parseFloat(request.getParameter("textno1"));
		 float n2 = Float.parseFloat(request.getParameter("textno2")); 
		 
		 out.println("<html lang=\"en\">");
	        out.println("<head>");
	        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">");
	        out.println("<style>");
	        out.println("body { background-color: #f5f5f5; }");
	        out.println(".container { max-width: 400px; margin: 40px auto; padding: 20px; background-color: #fff; border: 1px solid #ddd; border-radius: 10px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }");
	        out.println(".mx-auto { padding: 20px; }");
	        out.println("h1 { font-weight: bold; color: red;padding:5px; }");
	        out.println("p { margin-bottom: 10px; padding:5px;}");
	        out.println("</style>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<div class='container'>");
	        out.println("<div class='mx-auto'>");
	        out.println("<h1 style='text-align: center;'>My Calculator</h1>");
	        out.println("<p>Addition : " + (n1 + n2) + "</p>");
	        out.println("<p>Subtraction : " + (n1 - n2) + "</p>");
	        out.println("<p>Multiplication : " + (n1 * n2) + "</p>");
	        out.println("<p>Division : " + (n1 / n2) + "</p>");
	        out.println("</div>");
	        out.println("</div>");
	        out.println("</body>");
	        out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
