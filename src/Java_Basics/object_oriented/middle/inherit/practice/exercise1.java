package Java_Basics.object_oriented.middle.inherit.practice;

public class exercise1 {
    public static void main(String[] args) {
        Kids someKid = new Kids(20);
        someKid.printAge();
        someKid.setSex(1);
        someKid.setSalary(0);

        someKid.manOrWoman();
        someKid.employeed();
    }
}
class ManKind{
    private int sex;
    private int salary;

    public ManKind(){

    }
    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSex() {
        return sex;
    }
//    public String manOrWoman(){
//       return sex == 1 ? "man" : "woman" ;
//    }
//    public void manOrWoman(){
//    String gender = return sex == 1 ? "man" : "woman" ;
//    }
    public void manOrWoman(){
        switch (sex){
            case 1 :System.out.println("man");break;
            case 2 :System.out.println("woman");
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void employeed(){
        if (salary == 0){
            System.out.println("no job");
        }else {
        System.out.println("job");
        }
    }
}
class Kids extends ManKind{
    private int yearOld;

    public Kids(){

    }
    public Kids(int yearOld){
        this.yearOld = yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }
    public int getYearOld() {
        return yearOld;
    }

    public void printAge(){
        System.out.println(yearOld);
    }
    public void employeed(){
        System.out.println("Kids should study and no job");
    }
}
