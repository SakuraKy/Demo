import java.util.Scanner;

public class switch1_3 {
    public static void main(String[] args) {
        /*
         * 练习：
         * 当我们拨打了某些服务电话时，一般都会有按键选择。
         * 假设现在我们拨打了一个机票预定电话。
         * 电话中语音提示
         * 1机票查询
         * 2机票预订
         * 3机票改签
         * 4退出服务
         * 其他按键也是退出服务。请使用swtich模拟该业务逻辑。
         */
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择：");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
    }
}
