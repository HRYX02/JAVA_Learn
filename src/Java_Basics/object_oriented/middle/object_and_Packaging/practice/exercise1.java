package Java_Basics.object_oriented.middle.object_and_Packaging.practice;

public class exercise1 {
    public static void main(String[] args) {
        Order o1 = new Order(11,"史鑫玺");
        Order o2 = new Order(11,"史鑫玺");
        boolean isEquls = o1.equals(o2);
        System.out.println(isEquls);
    }
}
class Order{
    private int orderld;
    private String orderName;

    public Order() {
    }
    public Order(int orderld, String orderName) {
        this.orderld = orderld;
        this.orderName = orderName;
    }

    public int getOrderld() {
        return orderld;
    }
    public void setOrderld(int orderld) {
        this.orderld = orderld;
    }
    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Order){
            Order o = (Order) obj;
            if (this.orderld == o.orderld && this.orderName.equals(o.orderName)){
                return true;
            }else{
                return false;
            }
        }else return false;

    }

}