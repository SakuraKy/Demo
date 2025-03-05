import java.util.Scanner;

public class zonghexunlian1 {
    public static void main(String[] args) {
        /*
         * 需求：机票价格按照淡季旺季、头等舱和经济舱收费、输机票原价
         * 按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7
         * 折，经济舱6.5折。
         */

        // 自动抽取方法：ctrl + alt + m
        // 1.选择要抽取的代码 ； 2.按快捷键 ； 3.确认抽取

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格：");
        int money = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入舱：（0：头等舱，1：经济舱）");
        int cang = sc.nextInt();
        if (month >= 5 && month <= 10) {
            // 旺季
            money = getPrice(money, cang, 0.9, 0.85);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            // 淡季
            money = getPrice(money, cang, 0.7, 0.65);
        } else {
            System.out.println("不是有效月份");
        }
        System.out.println(money);
    }

    // 1.我要干嘛? 根据舱位和折扣来计算最终的票价
    // 2.我干这件事，需要什么才能完成? 原价 舱位 头等舱的折扣 经济舱的折扣
    // 3,方法的调用处是否需要继续使用这个结果 需要

    public static int getPrice(int money, int cang, double v0, double v1) {
        if (cang == 0) {
            // 头等舱
            money = (int) (money * v0);
        } else if (cang == 1) {
            // 经济舱
            money = (int) (money * v1);
        } else {
            System.out.println("不是有效舱");
        }
        return money;
    }
}
