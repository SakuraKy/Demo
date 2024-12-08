import java.util.Scanner;

public class for2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围的开始：");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束：");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
        /*结论：
        统计时，设置统计变量例如10行count，然后在if语句中++。
         */
    }
}
