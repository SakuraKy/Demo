public class suanfaDemo3 {
    public static void main(String[] args) {
        /*需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)
        将两数相除，要求不使用乘法、除法和 % 运算符，
        得到商和余数。
         */
        /*分析：
        可以用减法，例：
        100-10=90；90-10=80；.......；10-10=0
        一共减了10次，所以商为10；最后得0，所以余数为0
         */
        int dividend = 10;
        int divisor = 3;
        int x = 0;
        while (dividend >= divisor){
            dividend = dividend - divisor;
            x++;
        }
        System.out.println("商：" + x  + " " + "余数：" + dividend);
    }
}
