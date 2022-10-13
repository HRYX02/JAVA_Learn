package Java_Basics.异常.THROWS;
//手动抛出异常
public class Throw_exception_manually {
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
            //第一种方法
//            throw new RuntimeException("数据非法");
            //第二种方法
            throw new Exception("数据非法");
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
