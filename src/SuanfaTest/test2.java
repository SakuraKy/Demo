package SuanfaTest;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 读取玉米地长度
        int m = scanner.nextInt(); // 读取玉米地宽度
        int a = scanner.nextInt(); // 读取每平方米产量
        scanner.close();

        // 计算总产量并输出
        System.out.println((long) n * m * a);
    }

}
