package Java_Basics.自定义数组工具类;

import java.util.Arrays;

public class ArrayTool {

    //求数组最大值

    public int getMax(int[] array){
        int Max = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]>Max)
                Max=array[i];
        }
        return Max;
    }

    //求数组最小值

    public int getMin(int[] array){
        int Min = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]<Min)
                Min=array[i];
        }
        return Min;
    }

    //求数组总和

    public int getSum(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    //求数组平均值

    public int getAverage(int[] array){
            return getSum(array)/array.length;
    }

    //反转数组

    public void reversal(int[] array){
        for (int i=0;i<array.length/2;i++ ){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }

    //复制数组

    public int[] copy(int[] array){
        int[] array1 = new int[array.length];
        for (int i=0;i<array.length;i++){
            array1[i] = array[i];
        }
        return array1;
    }

    //数值排序

    public void sort(int[] array){
        Arrays.sort(array);
    }

    //遍历数组
    public void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
    //查找指定元素
    public int getIndex(int[] array,int dest) {
        for (int i=0;i<array.length;i++){
            if(dest == array[i]){
                return i;
            }
        }
        return -1;
    }
}