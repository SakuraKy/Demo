package SuanfaTest;

import java.util.Scanner;

public class FactorialMod {
    static final int MOD = 1000000007;

    public static long factorialMod(int n) {
        // 输入验证
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("请输入一个非负整数 n: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("错误：请输入非负整数！");
                return;
            }

            System.out.println(n + "! mod " + MOD + " = " + factorialMod(n));
        } catch (Exception e) {
            System.out.println("输入错误：请输入有效的整数！");
        } finally {
            scanner.close();
        }
    }
}