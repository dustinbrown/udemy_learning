package controller;

import java.io.IOException;

/**
 * Created by dbrown on 1/6/16.
 */
public class Controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");

        String page;

        if (action == null) {
            page = "/error.jsp";
        } else if ( action.equals("about")) {
            page = "/about.jsp";

        } else if ( action.equals("login")) {
            page = "/login.jsp";

        } else {
            page = "/error.jsp";
        }
        getServletContext().getRequestDispatcher(page).forward(request, response);
    }
}
