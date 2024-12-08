public class zifuchuan2_string {
    public static void main(String[] args) {
        //java.lang.String 类代表字符串，Java 程序中的所有字符串文字(例如“abc”)都为此类的对象
        //String注意点：字符串的内容是不会发生改变的，它的对象在创建后不能被更改

        //1.直接赋值获取一个字符串对象
        String s1 = "阿百川";
        System.out.println(s1);


        //2.new方式获取字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");


        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);


        //传递一个字符串数组，根据字符串数组的内容再创建一个新的字符串对象
        //需求：我要修改字符串的内容
        //因为字符串不能直接被修改，所以可以先把字符串转为字符串数组，再根据数组索引，改变字符串数组中的元素即可
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);


        //传递一个字节数组，根据字节数组内容再创建一个新的字符串对象
        //是先把数组里面的元素拿到ASCII码表里面去查，再输出结果
        //应用场景：网络输出数据都是字节信息，一般要把字节信息进行转换，转换为字符串，此时就要用到这个构造了
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);//abcd
    }
}
