package Java_Basics.OOP.middle.inherit继承;

public class CheckAccount extends Account {
    private int overdraft;//可透支限额

    public CheckAccount(){

    }
    public CheckAccount(int id,double balance,double annuallnterestRate,int overdraft){
//        super.setId(id);
//        super.setBalance(balance);
//        super.setAnnuallnterestRate(annuallnterestRate);
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
        }else if(amount >balance){
            if (balance + overdraft > amount){
                System.out.println("您的可透支额度为" + overdraft + "元");
                overdraft -= (amount - balance);
                balance = 0;
                System.out.println("您的可透支额度为" + overdraft + "元");
            }else if(overdraft > amount){
                overdraft -= amount;
                System.out.println("您的可透支额度为" + overdraft + "元");
            }else if (overdraft < amount){
                System.out.println("你的可透支额度不足,仅剩" + overdraft + "元");
            }
        }
    }
}
