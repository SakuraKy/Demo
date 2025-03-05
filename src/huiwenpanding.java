import java.util.Scanner;

public class huiwenpanding {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            char[] c = S.toCharArray();
            StringBuilder sb = new StringBuilder();
            double a = Math.pow(10, 6);
            for (int i = 0; i < c.length; i++) {
                char str = c[i];
                if (S.length() >= 1 && S.length() <= a) {
                    if (str >= 65 && str <= 122) {
                        for (int i1 = c.length - 1; i1 >= 0; i1--) {
                            char str2 = c[i1];
                            sb.append(str2);
                        }
                        String str3 = sb.toString();
                        if (str3.equals(S)) {
                            System.out.println("Y");
                        } else {
                            System.out.println("N");
                        }
                        break;

                    } else {
                        System.out.println("该字符串不符合规定，请重新输入");
                        break;
                    }
                }

            }
        }

    }
}
