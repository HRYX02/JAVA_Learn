package SmallProject.Project_Customer_information_management_system;

public class CustomerList {

    private Customer[] customers;
    private int total = 0;
    private int totalCustomer;

    public CustomerList(int totalCustomer) {
        this.totalCustomer = totalCustomer;
        customers = new Customer[this.totalCustomer];
    }

    public int getTotalCustomer() {
        return totalCustomer;
    }

    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        } else {
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index > total && index < 0) {
            return false;
        } else {
            customers[index - 1] = cust;
            return true;
        }
    }

    public boolean deleteCustomer(int index) {
        if (index > total) {
            return false;
        } else {
            for (int i = index; i < customers.length; i++) {
                customers[index - 1] = customers[index];
            }
            customers[total] = null;
            total--;
            return true;
        }
    }

    public Customer[] getAllCustomers() {
        Customer[] cust = new Customer[total];
        for (int i = 0; i < cust.length; i++) {
            cust[i] = customers[i];
        }
        return cust;
    }

    public Customer getCustomer(int index) {
        if (index > total && index < 0) {
            return null;
        } else {
            return customers[index - 1];
        }

    }

    public int getTotal() {
        return total;
    }

}

