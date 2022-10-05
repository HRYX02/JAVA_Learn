package SmallProject.Project_banking_system;

public class Customer {
    private  String firstName;
    private  String lastName;
    private  Account account;

    public Customer(){

    }
    public Customer(String f,String l){
        firstName = f;
        lastName = l;
    }

    public void setAccount(Account account){
        this.account = account;
    }
    public Account getAccount(){
        return this.account;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLasttName(){
        return lastName;
    }
}
