package SuanfaTest;

public class tiankong3 {

    // 计算gcd（最大公因数）
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        int target = 2024;
        int n = 2024;

        // 枚举从 1 开始的整数，找到第 2024 个与 2024 互质的数
        while (count < target) {
            num++;
            if (gcd(num, n) == 1) {
                count++;
            }
        }

        System.out.println(num);
    }
}
