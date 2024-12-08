public class yunsuanfu_2 {
    public static void main(String[] args) {
        //字符串相加
        //当“+”出现字符串时，会将前后字符串拼接。
        //连续进行“+”操作时，从左到右逐个执行。
        System.out.println(1 + 99 + "年陈酿");

        //字符相加
        //当字符+字符/字符+数字时，会把字符通过ASCII码表查询到对应的数字再进行计算。
        char c = 'a';
        int result = c + 0;
        System.out.println(result);
        System.out.println(1 + 'a');
        System.out.println('a' + "abc");
    }
}
