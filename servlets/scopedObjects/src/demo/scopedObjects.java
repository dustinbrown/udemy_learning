package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by dbrown on 1/14/16.
 */
public class scopedObjects extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Request
        request.setAttribute("test", "hello");
        String test = (String) request.getAttribute("test");

        // Session
        HttpSession session = request.getSession();
        session.setAttribute("test", "Hello");
        String test1 = (String) session.getAttribute("test");

        // Application
        ServletContext context = getServletContext();
        context.setAttribute("test", "Hello");
        String test2 = (String) context.getAttribute("test");
    }
}
