package demo;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dbrown on 1/14/16.
 */
public class Cookies extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        out.println("<html>");
        Cookie[] cookies = request.getCookies();
        if(cookies == null ) {
            out.println("No cookies found<br/>");
        } else {

            for(Cookie retrievedCookies: cookies) {
                String name = retrievedCookies.getName();
                String value = retrievedCookies.getValue();

                out.println(name + "=" + value + "<br/>");
            }
        }
        Cookie cookie = new Cookie("user", "dustin");

        cookie.setMaxAge(300); // Set to -1 as default which is deleted after the browser is closed

        response.addCookie(cookie);
        out.println("Cookie set<br/>");

        out.println("</html>");
    }
}
