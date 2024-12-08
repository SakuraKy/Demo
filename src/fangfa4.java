public class fangfa4 {
    public static void main(String[] args) {
        /*方法的重载
        在同一个类中，定义了多个同名的方法，这些同名的方法具有同种的功能。
        每个方法具有不同的参数类型或参数个数，这些同名的方法，就构成了重载关系
        简单记：同一个类，方法名相同，参数不同的方法，与返回值无关。
        参数不同：个数不同、类型不同、顺序不同
         */
        compare((byte) 10,(byte) 20);//可以利用强转，使用其他类型的方法
    }
    //会把相同功能的方法名起成一样的名字
    //好处1：定义方法的时候不用那么多单词了
    //好处2：调用方法的时候也不需要那么麻烦了
    public static void compare(byte b1 ,byte b2){
        System.out.println(b1 == b2);
    }
    public static void compare(short s1 ,short s2){
        System.out.println(s1 == s2);
    }
}
