package Class23;

public class BankAccount {

   private String name;
  final  private long bankAccountNum;
    private  double balance;
  final   private  String userName;
    private String password;
  final   private String accountType;

 public BankAccount(String name, long bankAccountNum, double balance, String userName, String password, String accountType) {
  this.name = name;
  this.bankAccountNum = bankAccountNum;
  this.balance = balance;
  this.userName = userName;
  this.password = password;
  this.accountType = accountType;
 }
 public BankAccount(long bankAccountNum, String userName, String password, String accountType) {

  this.bankAccountNum = bankAccountNum;
  this.userName = userName;
  this.password = password;

  this.accountType = accountType;
 }
 public BankAccount(String userName, String accountType ,long bankAccountNum) {
  this.bankAccountNum = bankAccountNum;
  this.userName = userName;
  this.accountType = accountType;
 }
 public  String getName(){
  return name;
 }
 public long getBankAccountNum(){
  return bankAccountNum;
 }
  void setName(String name){
  this.name=name;
 }
}
