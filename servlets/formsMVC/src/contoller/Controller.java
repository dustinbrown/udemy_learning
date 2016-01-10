package contoller;

import beansMVC.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dbrown on 1/9/16.
 */
public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else if (action.equals("dologin")){
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            request.setAttribute("email", email);

            User user = new User(email, password);

            if (user.validate()) {
                request.getRequestDispatcher("/loginsuccess.jsp").forward(request, response);
            } else {

                request.setAttribute("validationMessage", user.getMessage());
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        request.setAttribute("email", "");
        request.setAttribute("validationMessage", "");

        if (action == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }

    }
}
