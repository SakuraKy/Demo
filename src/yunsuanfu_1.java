public class yunsuanfu_1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 12.3;
        //隐式转换：取值范围小的转换为取值范围大的
        double c = a + b;
        System.out.println(c);
        /*1.取值范围:
        byte<short<int<long<float<double
        2.数据类型不一样时需要转换
        3.小范围和大范围进行预算时，首先小范围先转换为大范围，再进行计算
        4.byte short char都会直接提升为int，再进行计算
         */

        //强制转换：目标数据类型 变量名 = （目标数据类型）被强转的数据;
        double d = 12.3;
        int e = (int) d;
        System.out.println(e);
    }
}
