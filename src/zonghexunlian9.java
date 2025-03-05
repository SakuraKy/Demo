import java.util.Random;
import java.util.Scanner;

public class zonghexunlian9 {
    public static void main(String[] args) {
        /*
         * 投注号码由6个红色球号码和1个蓝色
         * 球号码组成。红色球号码从1-33中选
         * 择;蓝色球号码从1-16中选择。
         */

        // 用户输入号码
        int[] userInputArr = useInputNumber();

        // 生成中奖号码

        int[] arr = createNumber();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 判断用户中奖情况
        int redCount = 0;
        int blueCount = 0;

        // 判断红球中奖情况
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    /*
                     * 如果找到了，那么后面的数字就没必要继续比较了
                     * 跳出内循环，继续判断下一个
                     */
                    break;
                }
            }
        }
        // 判断蓝球中奖情况
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        // 根据红球和蓝球中奖情况来判断中奖金额
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你中了1等奖");
        }
        if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你中了2等奖");
        }
        if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你中了3等奖");
        }
        if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你中了4等奖");
        }
        if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你中了5等奖");
        }
        if ((redCount == 1 && blueCount == 1) || (redCount == 2 && blueCount == 1)
                || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你中了6等奖");
        } else {
            System.out.println("谢谢参与！");
        }
    }
    // 创建数组用来储存中奖号码

    public static int[] createNumber() {
        int[] arr = new int[7];

        // 随机生成号码添加到中奖数组中，且红球不能重复：1~33，蓝球可以重复1~16
        Random r = new Random();
        for (int i = 0; i < 6;) {
            // 获取红球的号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        // 生成蓝球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;

        return arr;
    }

    public static boolean contains(int[] arr, int number) {
        // 判断数字在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] useInputNumber() {
        // 创建数组添加用户购买彩票号码
        int[] arr = new int[7];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // 让用户输入红球号码
        for (int i = 0; i < 6;) {
            System.out.println("请输入第" + (i + 1) + "红球号码:");
            int redNumber = sc.nextInt();
            // 验证唯一性
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在");
                }
            } else {
                System.out.println("当前红球号码超出范围");
            }
        }
        // 用户输入蓝球号码
        System.out.println("请输入蓝球号码：");
        while (true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("蓝球号码超出范围");
            }
        }
        return arr;
    }
}
