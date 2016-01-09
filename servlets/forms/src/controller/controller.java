package controller;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dbrown on 1/6/16.
 */
public class controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");

        out.println("<html>");
        out.println("User via post: " + user);
        out.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");

        out.println("<html>");
        out.println("User: " + user);
        out.println("</html>");
    }
}
