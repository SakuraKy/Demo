package SuanfaTest;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > maxVal) {
                maxVal = num;
                count++;
            }
        }
        scanner.close();

        System.out.println(count);
    }
}
