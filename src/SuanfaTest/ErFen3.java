package SuanfaTest;

import java.util.Arrays;

public class ErFen3 {
    // 二分查找插入点(有重复元素)
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 4 };
        Arrays.sort(a);
        System.out.println(erfen(a, 3));
    }

    public static int erfen(int[] a, int target) {
        int r = 0, j = a.length - 1;
        while (r <= j) {
            int mit = r + (j - r) / 2;
            if (a[mit] < target) {
                r = mit + 1;
            } else if (a[mit] > target) {
                j = mit - 1;
            } else {
                j = mit - 1;
            }
        }
        return r;
    }
}
