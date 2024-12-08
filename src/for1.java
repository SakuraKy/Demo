public class for1 {
    public static void main(String[] args) {
        /*格式：
        for(初始化语句;条件判断语句;条件控制语句){
          循环体语句;
        }
         */
        //举例：
        for(int i = 1;i <= 10;i++){
            System.out.println("helloworld");
        }
        /*执行流程:
        1.执行初始化语句
        2.执行判断语句，看其结果是true还是false；如果是true，执行循环体语句；如果是false，循环结束
        3.执行条件控制语句
        4.回到2中继续执行判断语句
         */
        for (int t = 1;t <= 5;t++){
            System.out.println(t);
        }
    }
}
