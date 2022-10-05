package Java_Basics.exception_handling.Custom_exception;

public class MyexceptionText {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.regist(-20);
            System.out.println(student);
        } catch (Exception e) {
//           e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    private int ID;
    public void regist(int id) throws Exception{
        if (id < 1) {
            throw new MyException("数据不可以为负数");
        } else {
            ID = id;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                '}';
    }
}