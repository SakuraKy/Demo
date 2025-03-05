import java.util.Scanner;

public class zonghexunlian5 {
    public static void main(String[] args) {
        /*
         * 需求：在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为:去掉最
         * 高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
         */

        // 定义数组，储存评委打得分
        int[] scoreArr = getScores();
        // 定义变量，存储最大值
        int max = getMax(scoreArr);
        // 定义变量，存储最小值
        int min = getMin(scoreArr);
        // 定义变量，存储总和
        int sum = getSum(scoreArr);
        // 定义变量，存储平均分
        int avg = (sum - max - min) / (scoreArr.length - 2);
        // 打印结果
        System.out.println("平均分是：" + avg);

    }

    // 评委打分
    public static int[] getScores() {
        int[] scores = new int[6];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请评委打分（0~100）：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，请继续打分，当前的评委为：" + i);
            }
        }
        return scores;
    }

    // 求最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    // 求最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    // 求和
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = scoreArr[i] + sum;
        }
        return sum;
    }
}
