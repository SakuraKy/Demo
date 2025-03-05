package SuanfaTest;

import java.util.Arrays;

public class ErFen {
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 4 };
        Arrays.sort(a);
        erfen(a, 3);
        System.out.println(erfen(a, 3));
    }

    public static int erfen(int[] a, int target) {
        int r = 0, j = a.length - 1;
        while (r <= j) {
            int mit = r + (j - r) / 2;
            if (target > mit) {
                r = mit + 1;

            } else if (target < mit) {
                j = mit - 1;
            } else {
                return mit;
            }

        }
        return -1;
    }
}
