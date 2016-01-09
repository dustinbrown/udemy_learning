package gui;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dbrown on 1/6/16.
 */
public class HelloWorld extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<b>Hello World</b>");
        out.println("</html>");
    }
}
