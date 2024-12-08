public class suanfaDemo1 {
    public static void main(String[] args) {
        /*需求:给你一个整数 x。
        如果 x是一个回文整数，打印true ，否则，返回 false 。
        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数。
        例如，121 是回文，而123不是。
        */

        //核心思路：把数字倒过来跟原来的数字进行比较。

        //1.定义数字
        int x = 12345;
        //定义一个临时变量，用于记录x的初始值
        int temp = x;
        //记录倒过来之后的结果
        int number = 0;
        //2.利用循环从右往左获取每一位数字
        while(x != 0){
            int ge = x % 10;
            //修改x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            number = number * 10 + ge;
        }
        System.out.println(number);
        System.out.println(number == temp);
    }
}
