
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();

            String binary = Integer.toBinaryString(n);
            int distanceSum = 0;
            int prevOneIndex = -1; // 用于跟踪上一个 '1' 的索引

            // 遍历二进制字符串的每个字符
            for (int i = 0; i < binary.length(); i++) {
                char c = binary.charAt(i);
                if (c == '1') {
                    if (prevOneIndex != -1) {
                        // 计算当前 '1' 与上一个 '1' 之间的距离（空隙数量加1）
                        int distance = i - prevOneIndex;
                        // 如果您只想要空隙数量，则使用 i - prevOneIndex - 1
                        distanceSum += distance; // 累加距离
                    }
                    // 更新上一个 '1' 的索引
                    prevOneIndex = i;
                }
            }

            // 输出结果（所有相邻 '1' 之间的距离之和，包括空隙和 '1' 自身的一个位置）
            System.out.println(distanceSum);
        }
    }
