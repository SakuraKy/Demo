public class zizengzijian {
    public static void main(String[] args) {
        //自增：符号是++，变量加一。
        //结论：++/--，无论放在变量的前边还是后边，单独写一行结果都一样。
        int a = 10;
        a++;
        System.out.println(a);

        //自减：符号是--，变量减一。
        int b = 5;
        b--;
        System.out.println(b);

        //参与计算
        //1.先用后加
        int c = 10;
        int d = c++;//是先把c(10)赋值给d，然后在++（增一），d=10
        System.out.println(d);

        //2.先加后用
        int e = 10;
        int f = ++e;//f=11
        System.out.println(f);

        System.out.println("-----------------");

        //练习
        int x = 10;
        int y = x++;//x = 11, y = 10
        /*后++，先用后加
        先把x变量的值用，赋值给y，然后再进行自增
        那么y的值是自增前的
         */
        int z = ++x;//x = 12, z = 12
        /*前++，先加后用
        先把x进行自增，然后把自增后的结果赋值给z
         */
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);

    }
}
