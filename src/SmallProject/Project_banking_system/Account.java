package SmallProject.Project_banking_system;
//235集
public class Account {
    private int Id;//账户
    private double balance;//余额
    private double annuallnterestRate;//年利率

    public Account(){
        //空的构造器
    }
    public Account(int Id,double balance,double annuallnterestRate){
        this.Id = Id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public void setId(int ID){
        this.Id = ID;
    }
    public int getId(){
        return this.Id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setAnnuallnterestRate(double annuallnterestRate){
        this.annuallnterestRate = annuallnterestRate;
    }
    public double getAnnuallnterestRate(){
        return this.annuallnterestRate;
    }

    public void deposit(double amount){//存钱
        this.balance += amount;
        System.out.println("成功存入" + amount + "元，余额为：" + this.balance + "元");
    }
    public void withdraw (double amount){//取钱
        if (this.balance <  amount){
            System.out.println("您的账户余额仅为：" + this.balance + "元，你个穷*");
        }else{
            this.balance -= amount;
            System.out.println("成功取出" + amount + "元，余额为：" + this.balance + "元");
        }
    }
}

