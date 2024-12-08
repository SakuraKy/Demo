import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class ouifywe3hiouhfeoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("请输入一组长度为10的字符串S");
        char[] arr =scan.next().toCharArray();
        //System.out.println("请输入一组由数字和小写英文字母组成，长度不超过1000的字符串T");
        char[] ass=scan.next().toCharArray();
        for (int i = 0; i < ass.length; i++) {
            if (ass[i]>='0'&&ass[i]<='9'){
                int dex =ass[i]-'0';
                ass[i]=arr[dex];
            }
        }
        System.out.println(new String(ass));//输出T字符的最新结果。
        scan.close();
    }
}