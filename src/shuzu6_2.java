import java.util.Random;

public class shuzu6_2 {
    public static void main(String[] args) {
        /*需求:生成10个1~100之间的随机数存入数组。
            (1)求出所有数据的和
            (2)求所有数据的平均数
            (3)统计有多少个数据比平均值小
         */
        //1.定义数组（动态）
        int[] arr = new int[10];
        //2.把随机数存入到数组当中
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            //每循环一次，就会生成一个新的随机数。
            int num = r.nextInt(100) + 1;
            //把生成的随机数添加到数组中
            arr[i] = num;
        }
        //求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组中所有数的和：" + sum);


        //求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("数组中所有数的平均值：" + avg);

        //统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        System.out.println("比平均数小的个数：" + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
