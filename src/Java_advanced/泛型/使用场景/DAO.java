package Java_advanced.泛型.使用场景;

import java.util.List;

/**
 * DAO:data(base) access object
 *
 * @author SHIXINXI
 * @create 2022-10-13-19:29
 */
public class DAO<T>{//表的共性操作的DAO
    //添加一条记录
    public void add(T t){

    }
    //删除一条记录
    public boolean remove(int index){

        return false;
    }

    //修改一条记录
    public void update(int index,T t){

    }

    //查询一条记录
    public T getIndex(int index){

        return null;
    }

    //查询多条记录
    public List<T> getForList(int index){

        return null;
    }

    //查询多条记录
}
