package SuanfaTest;

import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[4];

        // 读取输入的四个字符串
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.next();
        }
        scanner.close();

        // 按字典序排序
        Arrays.sort(arr);

        // 按顺序拼接成最小字典序的字符串
        String result = arr[0] + arr[1] + arr[2] + arr[3];

        // 输出结果
        System.out.println(result);
    }
}
