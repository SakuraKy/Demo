public class zonghexunlian2 {
    public static void main(String[] args) {
        //判断101~200之间有多少个质数，并打印所有质数。
        /*思路一：判断该数与2~9之间能否整除；弊端：要是该数过大时，运行次数较多。
          思路二：判断该数与2~该数的平方根
         */


        int num = 0;
        for (int i = 101; i <= 200; i++) {
            //外循环，遍历101~200这个范围，依次得到这个范围之内的每个数字
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                //内循环，判断当前数字是否为一个质数
                //j:表示2~99之间的每一个数字
                if (i % j == 0){
                    flag = false;
                    break;//跳出单层循环，也就是本次练习的内循环
                }
            }
            if (flag){
                System.out.println("当前数字" + i + "是质数");
                num++;
            }else {
                System.out.println("当前数字" + i + "不是质数");
            }
        }
        System.out.println("一共有" + num + "个质数");
    }
}
