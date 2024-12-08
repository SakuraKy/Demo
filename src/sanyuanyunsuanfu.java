import java.util.Scanner;

public class sanyuanyunsuanfu {
    public static void main(String[] args) {
        //三元运算符：可以进行判断，根据判断的结果得到不同的内容。
        //注意：整个三元运算符必须要被使用
        //格式：关系表达式(判断语句) ? 表达式1 : 表达式2;

        //需求：使用三元运算符，获取两个数的较大值

        /*分析：
        1.定义两个变量
        2.使用三元运算符获取两个整数的较大值
         */
        int number1 = 10;
        int number2 = 20;
        int max1 = number1 > number2 ? number1 : number2;
        System.out.println(max1);

        /*计算规则：
        1.首先计算关系表达式的值
        2.如果结果为true，表达式1的值就是运算结果
        3.如果结果为false，表达式2的值就是运算结果
         */

        System.out.println("---------------------");

        //练习
        /*需求:动物园里有两只老虎，体重分别为通过键盘录入获得
        请用程序实现判断两只老虎的体重是否相同。
         */

        /*分析：
        1.键盘录入两只老虎的体重
        2.比较
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = sc.nextInt();
        String result = weight1 == weight2 ? "相同" : "不同";
        System.out.println(result);

        System.out.println("---------------------");

        /*需求:一座寺庙里住着三个和尚，已知他们的身高
        分别为150cm、210cm、165cm
        请用程序实现获取这三个和尚的最高身高。
         */

        /*分析：
        1.定义三个变量
        2.拿着第一个和尚和第二个和尚比较
        3.再拿着上个结果与第三个和尚比较
         */
        int height1 =150;
        int height2 = 210;
        int height3 = 165;
        int temp = height1 > height2 ? height1 : height2;
        int max2 = temp > height3 ? temp : height3;
        System.out.println(max2);
    }
}
