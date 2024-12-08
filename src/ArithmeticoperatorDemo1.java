public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3 + 2);
        //-
        System.out.println(3 - 2);
        //*
        System.out.println(7 * 9);

        //如果计算的时候有小数参与
        /*结论：
        计算的时候有小数参与计算的时候，结果有可能不精确。
         */
        System.out.println(1.1 + 1.1);
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
    }
}
