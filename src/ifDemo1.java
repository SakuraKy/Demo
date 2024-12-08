import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        //需求：需求:定义变量记录女婿的酒量，如果女婿的酒量大于2斤，老丈人就搭理他，否则就不搭理
        /*格式：if (关系表达式){
                   语句体;
                }
         */
        //1.输入女婿的酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine = sc.nextInt();
        //2.酒量判断
        if(wine > 2){
            System.out.println("小伙子，不错呦。");
        }
        /*注意点：
        1.大括号的开头可以另起一行书写，但建议在第一行末尾
        2.在语句体中，如果只有一句代码，大括号可以省略不写
        3.如果对一个布尔类型的变量进行判断，不要用==号，直接把变量写在小括号中
         */
    }
}
