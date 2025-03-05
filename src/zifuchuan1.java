import java.util.Scanner;

public class zifuchuan1 {
    public static void main(String[] args) {
        // API：应用程序编程接口
        // 简单理解：别人已经编好的东西，直接使用即可
        // JavaAPI:指JDK中提供的各种功能的Java类
        // 已经学习过的API：Scanner（键盘录入）、Random（随机数）

        // 1.创建对象
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数：");
        // 2.接收一个小数
        double result = sc.nextDouble();
        // 3.输出打印
        System.out.println(result);

        /*
         * 本字符串章所学习内容
         * 1.String,StringBuilder,StringJonier, StringBuffer, Pattern, Matcher
         * 可以掌握字符串的一些常见操作了，
         * 2.实际开发中的一些常见案例
         * 掌握分析问题，解决问题的能力，
         * 3.字符串相关的底层原理
         * 掌握原理更好的通过面试，处理开发中的一些复杂问题
         * 4.字符串的练习题
         * 锻炼大家独立解决问题的能力
         */

    }
}
