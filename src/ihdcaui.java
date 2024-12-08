import java.util.Scanner;

public class ihdcaui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //在此输入您的代码...
        //获取第一个字符串
        String S = sc.next();
        //获取第二个字符串
        String T = sc.next();
        //因为字符串不能更改，所以用StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T.length(); i++) {
            char c = T.charAt(i);
            if(c >= '0' && c <= '9'){
                //创立默认值
                char replacement = ' ';
                switch(c){
                    case '0':
                        replacement = S.charAt(0);
                        break;
                    case '1':
                        replacement = S.charAt(1);
                        break;
                    case '2':
                        replacement = S.charAt(2);
                        break;
                    case '3':
                        replacement = S.charAt(3);
                        break;
                    case '4':
                        replacement = S.charAt(4);
                        break;
                    case '5':
                        replacement = S.charAt(5);
                        break;
                    case '6':
                        replacement = S.charAt(6);
                        break;
                    case '7':
                        replacement = S.charAt(7);
                        break;
                    case '8':
                        replacement = S.charAt(8);
                        break;
                    case '9':
                        replacement = S.charAt(9);
                        break;
                    default:
                        break;

                }
                sb.append(replacement);

            }else {
                sb.append(T.charAt(i));
            }


        }

        String str = sb.toString();
        System.out.println(str);

        sc.close();
    }
}
