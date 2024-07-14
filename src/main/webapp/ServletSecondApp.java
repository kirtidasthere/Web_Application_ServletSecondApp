package main.webapp;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter; //IO me se aata hai

@WebServlet("/test")   //java based annotation
public class ServletSecondApp extends GenericServlet
{

    public void init(ServletConfig servletConfig) throws ServletException {

    }



    //main method
    public void service(ServletRequest servletRequest, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out= res.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Kirtidas There</h2>");
        out.println("<hr></body></html>");

    }


}

