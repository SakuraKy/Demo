import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        //if的第二种表达格式
        /*格式：if(关系表达式){
                   语句体1;
                }else{
                    语句体2;
                }
         */

        /*执行流程：
        1.首先计算关系表达式的值
        2.如果关系表达式的值为true就执行语句1
        3.如果关系表达式的值为false就执行语句2
        4继续执行后面的其他语句
         */

        /*练习:
        需求:键盘录入一个整数，表示身上的钱。
        如果大于等于100块，就是网红餐厅。
        否则，就吃经济实惠的沙县小吃。
         */
        //1.键盘录入一个整数，表示身上的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入钱包里的钱：");
        int money = sc.nextInt();
        //2.对钱进行判断
        if (money >= 100) {
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("吃沙县小吃");
        }

        /*练习：
        需求:
        假设，用户在超市实际购买，商品总价为:600元。
        键盘录入一个整数表示用户实际支付的钱。
        如果付款大于等于600，表示付款成功。否则付款失败。
         */
        //分析：
        //1.键盘录入一个整数表示用户实际支付的钱
        System.out.println("请输入支付的金钱：");
        int money2 = sc.nextInt();
        //2.进行判断
        if (money2 >= 600) {
            System.out.println("付款成功。");
        } else {
            System.out.println("付款失败。");
        }

        /*练习：
        需求：在实际开发中，电影院选座也会使用到if判断
        假设某影院售卖了100张票，票的序号为1~100。
        其中奇数票号坐左侧，
        偶数票号坐右侧。
        键盘录入一个整数表示电影票的票号。
        根据不同情况，给出不同的提示:
        如果票号为奇数，那么打印坐左边
        如果票号为偶数，那么打印坐右边，
         */
        //1.键盘录入票号
        System.out.println("请输入票号：");
        int number = sc.nextInt();
        //2.判断
        if (number >= 1 && number <= 100) {
            if (number % 2 == 1) {
                System.out.println("请坐左边");
            } else {
                System.out.println("请坐右边");
            }
        }


    }
}