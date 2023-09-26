package ReplitsP4;

public class Rep182Account {

    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public Rep182Account(String firstName, String lastName, int birthMonth,int birthDay, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    public String getFirstName() {
        System.out.println(firstName);
        return firstName;
    }

    public String getLastName() {
        System.out.println(lastName);
        return lastName;
    }
    public void formatBirthday(){

        System.out.println(birthMonth+"/"+birthDay+"/"+birthYear);

    }
    public String getSsn() {
        System.out.println(ssn);
        return ssn;
    }


    public static void main(String[] args) {
        Rep182Account person=new Rep182Account("John","Doe",10,
                25,1900,"123-45-6789");
        person.getFirstName();
        person.getLastName();
        person.formatBirthday();
        person.getSsn();


    }
}

