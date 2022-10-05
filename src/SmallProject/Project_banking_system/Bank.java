package SmallProject.Project_banking_system;

public class Bank {
    private Customer[] customers = new Customer[10];//存放多个客户的数组
    private int numberOfCustomers;//记录customers的个数

    public Bank(){

    }
    //添加客户
    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;

    }
    //获取客户个数
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
    //获取指定位置上的客户
    public Customer getCustomer(int index){
        //return customers[index];
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;

    }
}
