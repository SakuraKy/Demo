import java.util.Scanner;

public class ifDemo3_1 {
    public static void main(String[] args) {
        int price = 1000;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入会员级别：");
            int vip = sc.nextInt();
            if (vip == 1) {
                System.out.println("价格是" + price * 0.9);
            } else if (vip == 2) {
                System.out.println("价格是" + price * 0.8);
            } else if (vip == 3) {
                System.out.println("价格是" + price * 0.7);
            } else if (vip == 0) {
                System.out.println("价格是 1000");
            }
        }
    }
}
