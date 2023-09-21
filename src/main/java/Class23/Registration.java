package Class23;

public class Registration {
    private String email;
    private int age;
    private String userName;
    private String password;

 /*   public Registration(String email, int age, String userName, String password) {
        this.email = email;
        this.age = age;
        this.userName = userName;
        this.password = password;

        another way below
    }*/
       public Registration(String email, int age, String userName, String password) {
            setEmail(email);
            setAge(age);
            setUserName(userName);
            setPassword(password);
        }

    public Registration() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void displayRegistrationInfo() {
    }
}

class RegistrationTester {
        public static void main(String[] args) {
            Registration obj = new Registration("Ahmed@yahoo.com", 36, "Ahmed", "Password");
            obj.setEmail("Yazeed@gmail.com");
            obj.setUserName("Yazeed");
            obj.setAge(37);
            obj.setPassword("NewPassword");
            System.out.println(obj.getEmail());
            System.out.println(obj.getAge());
            System.out.println(obj.getUserName());
            System.out.println(obj.getPassword());


        }


    }
