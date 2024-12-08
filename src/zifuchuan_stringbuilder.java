public class zifuchuan_stringbuilder {
    public static void main(String[] args) {
        //StringBuilder:可以看成一个容器，创建之后里面的内容是可变的
        //使用场景：字符拼接，字符串反转
        //作用：提高字符串的操作效率
        //格式：public StringBuilder(参数),参数可写可不写
        //常用方法：
        // public StringBuilder append (任意类型)  添加数据，并返回对象本身
        //public StringBuilder reverse()  反转容器中的内容
        //public int length()  返回长度(字符出现的个数)
        //public String toString()  通过toString()就可以实现把StringBuilder转换为String

        //注意：打印StringBuilder对象不是地址值而是属性值



        //基本应用

        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //3.反转
        sb.reverse();


        //4.长度
        int len = sb.length();
        System.out.println(len);

        //5.把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);








        System.out.println(sb);



    }
}
