package SuanfaTest;

import java.util.HashMap;

public class tiankong4 {

    public static void main(String[] args) {
        String S = "ANQNANBNQNANQNQNBNINQNQNANQNINANQNANBNQNANQNQNBNBNQNQNANQNINANQNANBNQNANQNQNBNINQNQNANQNINBNQNANBNQN";

        HashMap<String, Integer> countMap = new HashMap<>();
        int maxScore = 0;
        String bestSubstring = "";

        // 枚举所有长度 1 到 10 的子串
        int n = S.length();
        for (int len = 1; len <= 10; len++) {
            for (int i = 0; i + len <= n; i++) {
                String sub = S.substring(i, i + len);
                countMap.put(sub, countMap.getOrDefault(sub, 0) + 1);
            }
        }

        // 找到最大贡献的子串
        for (String sub : countMap.keySet()) {
            int score = sub.length() * countMap.get(sub);
            if (score > maxScore || (score == maxScore && sub.compareTo(bestSubstring) < 0)) {
                maxScore = score;
                bestSubstring = sub;
            }
        }

        // 输出最佳子串
        System.out.println(bestSubstring);
    }
}
