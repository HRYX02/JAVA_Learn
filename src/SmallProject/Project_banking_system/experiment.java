package SmallProject.Project_banking_system;

public class experiment {
    public static void main(String[] args) {

        Customer C = new Customer("Jane","Smith");
        Account A = new Account(1000,2000.00,0.0123);
        C.setAccount(A);
        C.getAccount().deposit(100);
        C.getAccount().withdraw(960);
        C.getAccount().withdraw(2000);
        System.out.println("***");

        Bank B = new Bank();
        B.addCustomer("史","鑫玺");
        B.getCustomer(0).setAccount(new Account(10086,2000,0.123));
        B.getCustomer(0).getAccount().deposit(300);
        B.getCustomer(0).getAccount().withdraw(460);
        System.out.println("账号：" + B.getCustomer(0).getAccount().getId() +
                "\n姓名：" + B.getCustomer(0).getFirstName() + B.getCustomer(0).getLasttName() +
                "\n余额：" + B.getCustomer(0).getAccount().getBalance() + "元");
        System.out.println("***");

        B.addCustomer("崔","硕");
        B.getCustomer(1).setAccount(new Account(10000,20,0.123));
        B.getCustomer(1).getAccount().deposit(300);
        B.getCustomer(1).getAccount().withdraw(460);
        System.out.println("账号：" + B.getCustomer(1).getAccount().getId() +
                "\n姓名：" + B.getCustomer(1).getFirstName() + B.getCustomer(1).getLasttName() +
                "\n余额：" + B.getCustomer(1).getAccount().getBalance() + "元");
    }
}
