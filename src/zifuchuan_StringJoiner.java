import java.util.StringJoiner;

public class zifuchuan_StringJoiner {
    public static void main(String[] args) {
        //Stringjoiner跟StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的
        //作用:提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。
        //格式:
        //public StringJoiner(间隔符号)  创建一个StringJoiner对象，指定拼接时的间隔符号
        //public StringJoiner(间隔符号，开始符号，结束符号)  创建一个StringJoiner对象，指定拼接时的间隔符号、开始符号、结束符号
        //常用方法：
        //public StringJoiner add (添加的内容)  添加数据，并返回对象本身
        //public int length()  返回长度(字符出现的个数)
        //public String toString()  返回一个字符串(该字符串就是拼接之后的结果)


        //创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //打印结果
        System.out.println(sj);
    }
}
