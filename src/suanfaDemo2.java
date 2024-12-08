import java.util.Scanner;

public class suanfaDemo2 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数x:");
        int x = sc.nextInt();
        //2.设置一个变量记录初始变量x
        int temp = x;
        //3.设置一个变量记录倒序后的x
        int number = 0;
        while (x != 0){
            //4.取x变量中最后一位
            int ge = x % 10;
            //5.去掉取出的那个数
            x = x / 10;
            //6.记录倒序后的变量x
            number = number * 10 + ge;
        }
        //7.判断倒序后的变量x与初始变量x是否相同
        System.out.println(number == temp);
    }
}
