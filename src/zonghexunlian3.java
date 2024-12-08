import java.util.Random;

public class zonghexunlian3 {
    public static void main(String[] args) {
        /*需求:
        定义方法实现随机产生一个5位的验证码
        验证码格式:
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字
         */


        //分析：重点是随机！
        //方法：在一堆没什么规律的数据中随机抽取，可以先把这些数据放到数组中，在随机抽取


        //分析：
        //1.把大写字母和小写字母都放在数组中
        //2.随机抽取4次
        //3.随机抽取数字

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //添加小写字母
                //利用ASCII码表
                //a = 97
                chs[i] = (char) (97 + i);
            }else {
                //A = 65
                chs[i] = (char) (65 + i - 26);
            }
        }
        //定义一个字符串变量，记录最终结果
        String result = "";
        //随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int rangdomIndex = r.nextInt(chs.length);
            //利用随机索引，获取对应元素。
            //System.out.println(chs[rangdomIndex]);
            //1."" + 'a' = "a" 2."a" + 'b' = "ab"  达成这样的效果。
            result = result + chs[rangdomIndex];
        }

        //随机生成数字
        int number = r.nextInt(10);
        //生成最终结果
        result = result + number;
        System.out.println(result);
    }
}
