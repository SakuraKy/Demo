package API.System;

public class systemDemo {
    public static void main(String[] args) {
        //方法的形参：0表示正常退出，非0表示异常退出
        // System.exit(0);
        // System.out.println("hello");


        //获取当前时间毫秒值
        // long l = System.currentTimeMillis();
        // System.out.println(l);

        //数组拷贝
        // public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数) 
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        // arr2 = arr;拷贝
        //参数一：数据源，要拷贝的数据从哪个数组而来
        //参数二：数据源的起始索引，从arr数组中，索引为2的位置开始拷贝
        //参数三：目的地，把拷贝的数据，放到哪个数组中
        //参数四：目的地的起始索引，把拷贝的数据，放到arr2数组中，索引为3的位置开始
        //参数五：拷贝的个数
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
       
        }
        }
    }


