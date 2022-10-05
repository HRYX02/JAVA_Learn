package SmallProject.Project_Customer_information_management_system;

public class CustomerView {

    private CustomerList customerList = new CustomerList(5);

    public CustomerView() {
        Customer customer1 = new Customer("史鑫玺", '男', 20, "15963559164", "2291874995@gmail.com");
        Customer customer2 = new Customer("史鑫玺", '男', 18, "15963559164", "2291874995@gmail.com");
        customerList.addCustomer(customer1);
        customerList.addCustomer(customer2);
    }

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println("\t1 添 加 客 户");
            System.out.println("\t2 修 改 客 户");
            System.out.println("\t3 删 除 客 户");
            System.out.println("\t4 客 户 列 表");
            System.out.println("\t5 退      出");
            System.out.println("请选择(1-5):");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("是否退出(Y/N):");
                    char choice = CMUtility.readConfirmSelection();
                    if (choice == 'Y') {
                        isFlag = false;
                    } else {
                        isFlag = true;
                    }
            }
        }
    }

    private void addNewCustomer() {
        if (customerList.getTotal() >= customerList.getTotalCustomer()) {
            System.out.println("客户信息已满");
            return;
        } else {
            System.out.println("姓名：");
            String name = CMUtility.readString(30);
            System.out.println("性别：");
            char gender = CMUtility.readChar();
            System.out.println("年龄：");
            int age = CMUtility.readInt();
            System.out.print("电话：");
            String phone = CMUtility.readString(30);
            System.out.print("邮箱：");
            String email = CMUtility.readString(30);
            Customer customer = new Customer(name, gender, age, phone, email);
            customerList.addCustomer(customer);
            System.out.println("-----------------添加完成-----------------");
        }
    }

    private void modifyCustomer() {
        int number;
        for (; ; ) {
            System.out.println("请输入待修改的客户编号(-1退出):");
            number = CMUtility.readInt();
            Customer cust = null;
            if (number == -1) {
                break;
            } else {
                if (number > customerList.getTotal()) {
                    System.out.println("客户编号输入错误");
                } else {
                    cust = customerList.getCustomer(number);
                    Customer[] customer = customerList.getAllCustomers();
                    System.out.println((customer[number - 1].getName()
                            + "\t" + customer[number - 1].getGender()
                            + "\t\t" + customer[number - 1].getAge()
                            + "\t\t" + customer[number - 1].getPhone()
                            + "\t\t" + customer[number - 1].getEmail()));
                    System.out.println("姓名(" + cust.getName() + ")");
                    String name = CMUtility.readString(30);
                    System.out.println("性别(" + cust.getGender() + ")");
                    char gender = CMUtility.readChar();
                    System.out.println("年龄(" + cust.getAge() + ")");
                    int age = CMUtility.readInt(30);
                    System.out.println("电话(" + cust.getPhone() + ")");
                    String phone = CMUtility.readString(30);
                    System.out.println("邮箱(" + cust.getEmail() + ")");
                    String email = CMUtility.readString(30);
                    Customer customer1 = new Customer(name, gender, age, phone, email);
                    customerList.replaceCustomer(number,customer1);
                }
            }
        }
    }

    private void deleteCustomer() {
        int number;
        for (; ; ) {
            System.out.println("请输入待删除的客户编号(-1退出):");
            number = CMUtility.readInt();
            if (number == -1) {
                break;
            } else {
                if (number > customerList.getTotal()) {
                    System.out.println("无此用户");
                } else {
                    System.out.println("确定删除(Y/N):");
                    char choice = CMUtility.readConfirmSelection();
                    boolean isDelete = customerList.deleteCustomer(number);
                    if (isDelete == true) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("客户不存在");
                    }
                }
            }
        }
    }

    private void listAllCustomers() {
        Customer[] customer = customerList.getAllCustomers();
        for (int i = 0; i < customer.length; i++) {
            System.out.println((i + 1) + "\t" + customer[i].getName()
                    + "\t" + customer[i].getGender()
                    + "\t\t" + customer[i].getAge()
                    + "\t\t" + customer[i].getPhone()
                    + "\t\t" + customer[i].getEmail());
        }
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}