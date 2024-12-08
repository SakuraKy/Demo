public class fuzhiyunsuanfu {
    public static void main(String[] args) {
        /*+=
        规则：将左边和右边的值相加，然后将结果赋值给左边
         */
        double a = 10.0;
        int b = 20;
        a +=b;
        //等同于a = a+b
        System.out.println(a);
        System.out.println(b);

        /*-=
        规则：将左边和右边的值相减，然后将结果赋值给左边
         */
        int c = 5;
        int d = 2;
        c -= d;
        //等同于c = c-d
        System.out.println(c);

        /*细节：赋值运算符底层隐藏着强制类型转换
        如上述+=中，a = (int)(a + b)
         */
    }
}
