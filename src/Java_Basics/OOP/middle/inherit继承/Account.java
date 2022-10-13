package Java_Basics.OOP.middle.inherit继承;
//277集
public class Account {
    private int id;//账号
    protected double balance;//余额
    private double annuallnterestRate;//年利率

    public Account(){

    }
    public Account(int id,double balance,double annuallnterestRate){
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }
    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    //返回月利率
    public double getMonthlyInterest(){
        return (annuallnterestRate / 12) * 100;
    }
    //存款
    public void deposit(double amount){
//        System.out.println("你的余额为" + balance + "元");
//        System.out.println("成功存入" + amount + "元");
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        if (balance >= amount){
            //System.out.println("成功取出" + amount + "元");
            balance -= amount;
            //System.out.println("您的账户余额为" + balance + "元");
        }else{
            //System.out.println("你的余额仅为" + balance + "元");
            System.out.println("余额不足");
        }
    }
}
