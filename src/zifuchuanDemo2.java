import java.util.Scanner;

public class zifuchuanDemo2 {
    public static void main(String[] args) {
        // 遍历字符串
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        // 统计
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);// 字符串索引(i)所代表的值赋值给c
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        System.out.println("小写字母有" + smallCount);
        System.out.println("大写字母有" + bigCount);
        System.out.println("数字有" + numberCount);
    }
}
