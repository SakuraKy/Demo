import java.util.Scanner;

public class tiaozhuanxunhuanDemo3 {
    public static void main(String[] args) {
        //键盘录入一个正整数x，判断x是否为一个质数。
        //质数：一个整数只能被1和本身整除
        //分析：循环，范围是2到x-1为止，看这个范围能不能被整除，如果能为合数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();
        //标记思想，表示x最初是一个质数
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(x + "是一个质数");
        }else {
            System.out.println(x + "不是一个质数");
        }
    }
}
