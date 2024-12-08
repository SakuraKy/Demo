import java.util.Random;
import java.util.Scanner;

public class sdfg {
    public static void main(String[] args) {
        /*投注号码由6个红色球号码和1个蓝色
        球号码组成。红色球号码从1-33中选
        择;蓝色球号码从1-16中选择。
         */

        //建数组储存用户输入的号码
        int[] yonghu = yonghu();
        //建数组储存正确号码
        int[] arr = zhengquehaoma();
        //输出正确号码
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //记录红球，蓝球中了多少个
        int redCount = 0;
        int blueCount = 0;
        //检验红球正确数
        for (int i = 0; i < yonghu.length - 1; i++){
            int red = yonghu[i];
            for (int j = 0; j < arr.length; j++) {
                if (red == arr[i]){
                    redCount++;
                    break;
                }
            }
        }
        //检验蓝球正确数
        int bule = yonghu[yonghu.length - 1];
        if (bule == arr[arr.length - 1]){
            blueCount++;
        }

        //根据红球和蓝球正确数确定中奖金额
        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜你中了1等奖");
        }
        if (redCount == 6 && blueCount == 0){
            System.out.println("恭喜你中了2等奖");
        }
        if (redCount == 5 && blueCount == 1){
            System.out.println("恭喜你中了3等奖");
        }
        if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你中了4等奖");
        }
        if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你中了5等奖");
        }
        if ((redCount == 1 && blueCount == 1) || (redCount == 2 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你中了6等奖");
        }else {
            System.out.println("谢谢参与！");
        }
    }





    //随机生成中奖号码
    public static int[] zhengquehaoma(){
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i <6;){
            int arrNew = r.nextInt(33) + 1;
            boolean flag = weiyi(arr,arrNew);
            if (!flag){
                arr[i] = arrNew;
                i++;
            }
        }
        int bule = r.nextInt(16) + 1;
        arr[arr.length - 1] = bule;
        return arr;
    }


    //判断唯一性
    public static boolean weiyi(int[] arr,int arrNew){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrNew){
                return true;
            }
        }
        return false;
    }

    //键盘录入用户号码
    public static int[] yonghu(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入第" + (i + 1) + "号的号码：");
            int redNumber = sc.nextInt();
            if (redNumber > 0 && redNumber < 33){
                boolean flag = weiyi(arr,redNumber);
                if (!flag){
                    arr[i] = redNumber;
                    i++;
                }
            }else {
                System.out.println("输入的号码不在范围内");
            }
            int blueNumber = sc.nextInt();
            if (blueNumber > 0 && blueNumber < 17){
                arr[arr.length - 1] = blueNumber;
            }
        }
        return arr;
    }
}
