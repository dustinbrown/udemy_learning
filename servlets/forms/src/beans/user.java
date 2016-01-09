package beans;
/**
 * Created by dbrown on 1/9/16.
 */
public class User {
    private String email;
    private String password;

    // Beans need a default constructor with no params
    public User() {

    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    private String message;

    public boolean validate() {
        if (email == null) {
            message = "No email address set";
            return false;
        }
        if (password == null) {
            message = "No password set";
            return false;
        }

        if (! email.matches("\\w+@\\w+\\.\\w+")) {
            message = "Invalid email address";
            return false;
        }

        if (password.length() < 8) {
            message = "Message must be at least 8 characters";
            return false;
        } else if (password.matches("\\w*\\s+\\w*")) {
            message = "Password can not contain space";
            return false;
        }
        return true;
    }
}

