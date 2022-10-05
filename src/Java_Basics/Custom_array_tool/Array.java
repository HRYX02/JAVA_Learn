package Java_Basics.Custom_array_tool;
//自定义数组工具类
public class Array {
    public static void main(String[] args) {
        ArrayTool arr = new ArrayTool();
        int[] array = new int[]{-5,3,10,-6,360,-100};
        arr.print(array);
        int Max = arr.getMax(array);
        System.out.println("最大值：" +Max);
        arr.reversal(array);
        arr.print(array);
        System.out.println(arr.getIndex(array,-6));
    }
}
