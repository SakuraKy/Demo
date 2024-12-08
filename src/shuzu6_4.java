import java.util.Random;

public class shuzu6_4 {
    public static void main(String[] args) {
        //需求：定义一个数组，存入1~5，要求打乱数组中的所有数据的顺序。
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.导包，随机数
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //3.生成随机索引
            int rangdomIndex = r.nextInt(arr.length);
            //4.拿着随机索引指向的元素跟i指向的元素进行交换。
            int temp = arr[i];
            arr[i] = arr[rangdomIndex];
            arr[rangdomIndex] = temp;
        }
        //5.当循环结束之后，那么数组中所有的数据已经打乱顺序了
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
