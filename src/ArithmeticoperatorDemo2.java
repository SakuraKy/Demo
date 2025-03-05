import java.util.Scanner;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        // 除法
        // 结论：如果只有整数参与计算，结果只有整数；有小数参与计算，结果（有可能不准确）有小数
        System.out.println(10 / 2);// 5
        System.out.println(10 / 3);// 3
        System.out.println(10.0 / 3);// 3.33333333...
        // 取模，得到的是余数
        System.out.println(10 % 2);// 0
        System.out.println(10 % 3);// 1
        try (/*
              * 应用场景
              * 1.可以利用取模来判断是否可以被整数
              * 2.可以判断某数是否为偶数 A % 2（若结果为零，A为偶数）
              * 3.斗地主发牌，3名玩家，每张牌都定义一个序号，序号 % 3，若结果为1，就发给第一名玩家，以此类推
              */
                // 数值拆分，总结：个位：数值 % 10；十位:数值 / 10 % 10；百位：数值 / 100 % 10；以此类推
                // 任务：键盘录入三位数，获取个位，十位，百位
                Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入一个三位数");
            int number = sc.nextInt();
            int ge = number % 10;
            int shi = number / 10 % 10;
            int bai = number / 100 % 10;
            System.out.println("个位是" + ge);
            System.out.println("十位是" + shi);
            System.out.println("百位是" + bai);
        }
    }
}
