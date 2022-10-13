package Java_advanced.泛型.使用场景;

import org.junit.Test;

import java.util.List;

/**
 * @author shkstart
 * @create 2019 上午 11:57
 */
public class DAOTest {

    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);


        StudentDAO dao2 = new StudentDAO();
        dao2.add(new Student());
        Student student = dao2.getIndex(1);
    }
}
