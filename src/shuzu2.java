public class shuzu2 {
    public static void main(String[] args) {
        //数组的地址值：数组在内存中的位置

        double[] arr1 = {1.65,1.67,1.75};
        System.out.println(arr1);//[D@7f31245a
        /*解释：
        [:表示当前是一个数组
        D：表示数据类型是double
        @:表示一个间隔符号（固定格式）
        7f31245a:这才是数组真正的地址值（十六进制）
        平常习惯把这个整体叫做数组的整体值。
         */
    }
}
