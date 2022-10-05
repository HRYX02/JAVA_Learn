package Java_Basics.object_oriented.middle.inherit;

public class AccountText {
    public static void main(String[] args) {
//        Account A = new Account(1122,20000,0.045);
//        A.withdraw(30000);
//        System.out.println("您的账户余额为" + A.getBalance());
//        System.out.println("******");
//        A.withdraw(2500);
//        System.out.println("您的账户余额为" + A.getBalance());
//        System.out.println("******");
//        A.deposit(3000);
//        System.out.println("您的账户余额为" + A.getBalance());
//        System.out.println("月利率为:" + +A.getMonthlyInterest() + "%");
//        System.out.println("******----******");
        CheckAccount B = new CheckAccount(1122,20000,0.045,5000);
        B.withdraw(5000);
        System.out.println("您的账户余额为" + B.getBalance());
        //System.out.println("您的可透支额为" + B.getOverdraft());
        System.out.println("******");
        B.withdraw(18000);
        //System.out.println("您的账户余额为" + B.getBalance());
        //System.out.println("您的可透支额为" + B.getOverdraft());
        System.out.println("******");
        B.withdraw(3000);
        //System.out.println("您的账户余额为" + B.getBalance());
        //System.out.println("您的可透支额为" + B.getOverdraft());
    }
}
