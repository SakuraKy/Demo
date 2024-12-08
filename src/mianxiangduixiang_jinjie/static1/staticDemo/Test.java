package mianxiangduixiang_jinjie.static1.staticDemo;

public class Test {
    public static void main(String[] args) {
        //测试工具类中的俩个方法是否正确
        //工具类是帮助解决各种事情，不需要创建对象


        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);



        double[] arr2 = {1.2,3.9,4.9,5.8,6.6};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
