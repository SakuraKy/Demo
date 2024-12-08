public class zifuchuanDemo4 {
    public static void main(String[] args) {
        /*定义一个方法，实现字符串反转，
        键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入 abc，输出结果 cba
         */

        String result = reverser("abc");
        System.out.println(result);
    }


    public static String reverser(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //i:表示索引（倒着的）
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
