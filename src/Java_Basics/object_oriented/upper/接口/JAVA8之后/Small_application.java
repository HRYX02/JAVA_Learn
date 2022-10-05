package Java_Basics.object_oriented.upper.接口.JAVA8之后;

public class Small_application {
    interface Filial {// 孝顺的
        default void help() {
            System.out.println("老妈，我来救你了");
        }
    }

    interface Spoony {// 痴情的
        default void help() {
            System.out.println("媳妇，别怕，我来了");
        }
    }

    class Father{
        public void help(){
            System.out.println("儿子，就我媳妇！");
        }
    }

    class Man extends Father implements Filial, Spoony {

        @Override
        public void help() {
            System.out.println("我该就谁呢？");
            Filial.super.help();
            Spoony.super.help();
        }

    }

}
