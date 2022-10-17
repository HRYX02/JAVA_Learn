package Java_advanced.IO流.File类使用.练习;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author SHIXINXI
 * @create 2022-10-15-19:38
 */
public class exe {
    @Test
    public void test1() throws IOException {
        File file = new File("D:\\IO\\file");
        file.mkdir();
        if (file.exists()){
            System.out.println("file创建成功");
        }
        File file1 = new File("D:\\IO\\file\\f1\\f2\\f3\\f4");
        file1.mkdirs();
        if (file1.exists()){
            System.out.println("file1创建成功");
        }
        for (int i = 1;i <= 4; i++){
            File file2 = new File("D:\\IO\\file\\"+ i +".txt");
            file2.createNewFile();
        }
    }
    @Test
    public void test2(){
        File del = del("1.txt");
        System.out.println(del);
    }
    public File del(String name){
        File file = new File("D:\\IO\\file\\"+name);
        boolean delete = file.delete();
        if (delete){
            System.out.println("删除成功");
        }
        return file;
    }
    @Test
    public void test3(){
        File file = new File("D:\\IO\\file\\f1\\f2\\f3\\f4");

        System.out.println(file.listFiles());
//        del(new File("D:\\IO\\file"));
    }
    public void del(File file){
        if (file.listFiles() == null){
            file.delete();
        }else {
            File[] all = file.listFiles();
            System.out.println(file);
            for (File f:all){
                del(f);
            }
        }
    }
}
