import java.util.Scanner;

public class switch1_2 {
    public static void main(String[] args) {
        /*
         * default
         * 1.位置:不一定写在最下面，我们可以写在任意位置，只不过习惯写在最下面
         * 2.省略：可以省略，但不推荐省略
         */
        /*
         * case穿透
         * 产生原因：就是语句体中没有写break导致的
         * 执行流程：1.拿小括号的值跟下面每个case进行匹配
         * 2.如果匹配上了就会执行相应语句体，如果此时发现了break结束整个switch语句，如果没发现break，程序会继续执行下个case的语句，
         * 会一直到下一个break或大括号为止
         */
        // switch的应用场景：有很多个个体，让我们一一列举出来
        // if第三种格式的应用场景：表达范围的时候
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("工作日");
                break;
            case 2:
                System.out.println("工作日");
                break;
            case 3:
                System.out.println("工作日");
                break;
            case 4:
                System.out.println("工作日");
                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期！");
                break;
        }
    }
}
