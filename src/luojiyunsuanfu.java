import java.util.Scanner;

public class luojiyunsuanfu {
    public static void main(String[] args) {
        //1.&(且)，两边都为真，结果才是真。
        System.out.println(true & true);//true
        System.out.println(true & false);//false
        System.out.println(false & false);//false
        System.out.println(false & true);//false

        System.out.println("------------------");

        //2.|(或者)，只要有一个为真，结果为真。
        System.out.println(true | true);//true
        System.out.println(true | false);//true
        System.out.println(false | false);//false
        System.out.println(false | true);//true

        System.out.println("------------------");

        //3.^(异或)，相同为false，不同为true。
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ false);//false
        System.out.println(false ^ true);//true

        System.out.println("------------------");

        //4.!(取反)
        //提示：取反的感叹号不要写多次，要么不写，要么只写一次。
        System.out.println(!true);//false
        System.out.println(!false);//true

        System.out.println("------------------");

        //短路逻辑运算符，意义：提高程序运行速度。
        //1.&&(短路与)，运行结果跟单个&是一样的，表示两边都为真，结果才是真
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        System.out.println("------------------");

        //2.||(短路或)，运行结果跟单个|是一样的，表示两边都为假，结果才是假
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        System.out.println("------------------");

        //3.短路逻辑运算符具有短路效果
        //理解：当左边的表达式能确定最终的结果，那么右边就不用参与运行了。
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10
        //若是单个&，是真是假，右边的都会执行，b=11

        System.out.println("------------------");

        //练习
        /*数字6是一个真正伟大的数字，键盘录入两个整数。
        如果其中一个为6，最终结果输出true。
        如果它们的和为 6的倍数。最终结果输出true。
        其他情况都是false。
         */
        //分析：a == 6 || b == 6 || (a+b) % 6 ==0
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请在输入一个整数：");
        int number2 = sc.nextInt();
        boolean jieguo = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(jieguo);
    }
}
