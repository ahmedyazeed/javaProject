package Class18;

public class userInfo extends user {
    String userAdd;

    public userInfo(String name, int mobileNum,String userAdd) {

        super(name, mobileNum);
        this.userAdd=userAdd;


    }
    public void userDetails(){
        System.out.println(name+" "+mobileNum+" "+userAdd);



    }
}
