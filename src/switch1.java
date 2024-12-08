public class switch1 {
    public static void main(String[] args) {
        /*switch语句格式
        switch (表达式){
            case 值1:
                语句体1;
                break;
            case 值2:
                语句体2;
                break;
            ...
            default:
                语句体n+1;
                break;
         */
        /*执行流程：
        1.首先计算表达式的值
        2.依次跟case的值进行比较，如果有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束
        3.如果所有的case的值和表达式的值都不匹配，就会执行default里面的语句体，然后结束整个switch语句
         */
        String noodles = "普通面";
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
