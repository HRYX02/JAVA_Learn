package Java_advanced.泛型.练习.two;

import java.util.*;

/**
 * @author SHIXINXI
 * @create 2022-10-14-10:29
 */
public class Dao<T> {
    private  Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        Iterator<T> iterator = values.iterator();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
