import java.util.Scanner;

public class tiaozhuanxunhuanDemo2 {
    public static void main(String[] args) {
        //键盘录入一个大于等于2的整数x，计算并返回x的平方根，结果只保留整数部分，小数部分被舍去。
        /*分析
        从1开始循环，拿着数的平方跟原来的数进行比较
        如果小于，那么继续往后判断
        如果相等，表示当前数字就是平方根
        如果大于，那么前一个数字就是平方根的整数部分
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个>=2的整数：");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            if(i * i == x){
                System.out.println(i + "就是" + x + "的平方根");
                break;
            }else if (i * i > x){
                System.out.println((i - 1) + "就是" + x + "平方根的整数部分");
                break;
            }
        }
    }
}
