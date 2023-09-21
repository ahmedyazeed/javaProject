package GroupExercise2;
/*Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.*/

public class GE12Registration {
    private String email;
    private String userName;
    private String password;

    public GE12Registration() {
        // Default constructor
    }

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format. Please use only Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. It should not be empty and should be at least 7 characters long.");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It should not be empty, should be at least 7 characters long, and should not contain the userName.");
        }
    }

    public void displayRegistrationInfo() {
        System.out.println("Registration Information:");
        System.out.println("Email: " + email);
        System.out.println("UserName: " + userName);
        // For security reasons, we won't display the password here
    }

    public static void main(String[] args) {
        GE12Registration registration = new GE12Registration();

        // Set valid email, userName, and password
        registration.setEmail("user@yahoo.com");
        registration.setUserName("validUserName");
        registration.setPassword("validPassword");

        // Display registration information
        registration.displayRegistrationInfo();

        // Set invalid email, userName, and password
        registration.setEmail("invalid@gmail.com");
        registration.setUserName("short");
        registration.setPassword("passwordwithshort");

        // Display registration information (should show only the valid ones)
        registration.displayRegistrationInfo();
    }
}

