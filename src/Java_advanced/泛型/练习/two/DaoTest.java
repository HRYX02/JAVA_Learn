package Java_advanced.泛型.练习.two;

import java.util.List;

/**
 * @author SHIXINXI
 * @create 2022-10-14-10:45
 */
public class DaoTest {
    public static void main(String[] args) {
        Dao<User> dao = new Dao();
        dao.save("1001",new User(1001,34,"周杰伦"));
        dao.save("1002",new User(1002,20,"昆凌"));
        dao.save("1003",new User(1003,25,"蔡依林"));
        dao.update("1001",new User(1001,21,"史鑫玺"));
        List<User> list = dao.list();
        System.out.println(list);

    }
}
