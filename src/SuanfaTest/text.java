package SuanfaTest;

import java.util.Scanner;

public class text {

    static final int MOD = 1000000007;

    // 分治法计算区间 [low, high] 内所有数的乘积模 MOD
    private static long productRange(int low, int high) {
        if (low > high)
            return 1;
        if (low == high)
            return low;
        int mid = (low + high) >>> 1; // 等同于 (low + high) / 2，但更高效
        long leftProduct = productRange(low, mid);
        long rightProduct = productRange(mid + 1, high);
        return (leftProduct * rightProduct) % MOD;
    }

    // 高效计算 n! mod MOD 的函数
    public static long factorialMod(int n) {
        // 如果 n 大于等于 MOD，则 n! 包含 MOD 因子，结果必定为 0
        if (n >= MOD)
            return 0;
        // 利用分治法计算乘积，减少循环常数开销
        return productRange(1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorialMod(n));
        scanner.close();
    }
}
