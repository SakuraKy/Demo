import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        // if语句中表达多种关系的语句
        /*
         * 格式：
         * if(关系表达式1){
         * 语句体1
         * } else if(关系表达式2){
         * 语句体2
         * }
         * ...
         * else{
         * 语句体n+1
         * }
         */

        /*
         * 执行流程：
         * 1.首先计算关系表达式1的值
         * 2.如果为true就执行关系表达式1，如果为false就计算关系表达式2的值
         * 3. ..........
         * 4.如果所有关系表达式结果都为false，就执行关系表达式n+1
         */

        try (/*
              * 练习：
              * 根据不同的分数送不同的礼物。
              * 如果是95~100分，送自行车一辆
              * 如果是90~94分，游乐场玩一天
              * 如果是80~89分，送变形金刚一个。
              * 如果是80分，揍一顿。
              */
                // 1.键盘录入小明的成绩
                Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入小明的成绩：");
            int score = sc.nextInt();
            // 2.根据成绩，给出不同奖励
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("送变形金刚");
            } else if (score < 80) {
                System.out.println("揍一顿");
            }
        }
    }
}
