public class zifuchuan3_bijiao {
    public static void main(String[] args) {
        //比较

        //1.==比较
        //基本数据类型：比较的是数据本身
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);


        //引用数据类型：比较的是地址值
        String s3 = new String("abc");
        System.out.println(s1 == s3);

        //2.比较字符串的内容是否相等
        //equals:必须完全相等才true（大小写）
        boolean result = s1.equals(s3);
        System.out.println(result);

        //equalsIgnoreCase:忽略大小写，进行比较(只能在英文状态下)
        String s4 = new String("Abc");
        boolean result2 = s1.equalsIgnoreCase(s4);
        System.out.println(result2);
    }
}
