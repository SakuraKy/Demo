package mianxiangduixiang_jinjie.static1.staticDemo;

public class ArrayUtil {
    //私有化创建方法
    //目的：不让外界创建它的对象
    private ArrayUtil(){}

    //创建工具方法，定义为静态的，方便调用

    //返回整数数组的内容
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //i 索引、arr[i] 元素
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}
