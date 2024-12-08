import java.util.Random;

public class zonghexunlian8_2 {
    public static void main(String[] args) {
        /*需求：
        一个大V直播抽奖，奖品是现金红包，分别有(2,588,888,1000,10000)五个奖金。请使用代码模拟抽奖
        打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下:(随机顺序，不一定是下面的顺序)
         */
        //效率比第一版高

        //原理是直接打乱原始数组的顺序形成所谓的抽奖结果

        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomInxt = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomInxt];
            arr[randomInxt] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
