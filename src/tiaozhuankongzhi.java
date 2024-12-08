public class tiaozhuankongzhi {
    public static void main(String[] args) {
        //需求：小老虎吃包子，第三个包子有虫子，跳过
        for (int i = 1; i <= 5; i++) {
            if(i == 3){
                //结束本次循环，继续下次循环
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
        //需求：小老虎吃包子，吃完第三个包子，吃饱了
        for (int t = 1; t < 5; t++) {
            System.out.println("小老虎在吃第" + t + "个包子");
            if (t == 3){
                //结束整个循环
                break;
            }
        }
    }
}
