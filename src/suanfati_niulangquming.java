import java.util.Scanner;

public class suanfati_niulangquming {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        String s = Scan.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < s.length();i++){
            int m = Scan.nextInt();
            sb.append(s.charAt(m - 1));
        }
        System.out.println(sb.toString());
    }
}
