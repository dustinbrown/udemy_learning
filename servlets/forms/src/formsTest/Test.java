package formsTest;

import beans.User;

/**
 * Created by dbrown on 1/9/16.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User("djb@gmail.com", "letmeilnff");
        // Bad User user = new User("@gmail.com", "letmeilnff");
        // Good User user = new User("djb@gmail.com", "letmeilnff");

        if (user.validate()) {
            System.out.println("Bean validates Ok");
        }    else {
            System.out.println(user.getMessage());

        }
    }
}
