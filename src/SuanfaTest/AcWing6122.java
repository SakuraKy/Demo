package SuanfaTest;

import java.io.*;
import java.util.*;

public class AcWing6122 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][n], b = new int[n][n], c = new int[n][n];
        int ans = 0;
        while (q-- != 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()),
                    z = Integer.parseInt(st.nextToken());
            if (++a[x][y] == n)
                ans++;
            if (++b[x][z] == n)
                ans++;
            if (++c[y][z] == n)
                ans++;
            System.out.println(ans);
        }
    }
}
