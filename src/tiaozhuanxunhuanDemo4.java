import java.util.Random;
import java.util.Scanner;

public class tiaozhuanxunhuanDemo4 {
    public static void main(String[] args) {
        //程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少
        //小需求：保底机制
        int count = 0;
        Random r = new Random();
        //小括号是生成数的范围，这个范围一定是从0开始的，到这个数-1结束。
        /*秘诀：
        1.让这个范围头尾都减去一个值，让这个范围从0开始
        2.尾巴+1
        3.最终的结果加上第一步减去的那个值
         */
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要猜的数字：");
            int x = sc.nextInt();
            count++;
            if (count == 3){
                System.out.println("猜中了！");
                break;
            }
            if (number < x){
                System.out.println("大了");
            }else if (x < number){
                System.out.println("小了");
            }else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }

    }
}
