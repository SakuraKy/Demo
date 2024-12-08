import java.util.Random;

public class zonghexunlian8 {
    public static void main(String[] args) {
        /*需求：
        一个大V直播抽奖，奖品是现金红包，分别有(2,588,888,1000,10000)五个奖金。请使用代码模拟抽奖
        打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下:(随机顺序，不一定是下面的顺序)
         */
        int[] arr = {2,588,888,1000,10000};

        //建一个数组用来存储抽奖的值
        int[] newArr = new int[arr.length];

        //抽奖
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            boolean flag = contains(newArr,prize);
            if (!flag){
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    //判断奖项是否在数组中存在，存在：true，不存在：false
    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
