package SuanfaTest;

public class MaoPao {
    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 4 };
        bubbleSortWithFlag(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    // public static int[] maoPao(int[] a) {
    // for (int i = a.length - 1; i > 0; i--) {
    // for (int j = 0; j < i; j++) {
    // if (a[j] > a[j + 1]) {
    // int temp = a[j];
    // a[j] = a[j + 1];
    // a[j + 1] = temp;
    // }
    // }
    // }
    // return a;
    // }
    public static int[] bubbleSortWithFlag(int[] nums) {
        // 外循环：未排序区间为 [0, i]
        for (int i = nums.length - 1; i > 0; i--) {
            boolean flag = false; // 初始化标志位
            // 内循环：将未排序区间 [0, i] 中的最大元素交换至该区间的最右端
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // 交换 nums[j] 与 nums[j + 1]
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true; // 记录交换元素
                }
            }
            if (!flag)
                break; // 此轮“冒泡”未交换任何元素，直接跳出
        }
        return nums;
    }
}