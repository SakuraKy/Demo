package SuanfaTest;

public class ChaRu {
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 4 };
        charu(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] charu(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int base = a[i], j = i - 1;
            while (j >= 0 && a[j] > base) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = base;
        }
        return a;
    }
}
