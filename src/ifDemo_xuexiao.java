import java.util.Scanner;

public class ifDemo_xuexiao {
    public static void main(String[] args) {
        /*练习1
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        if(num + num2 > 50){
            System.out.println("yes");
        }else if(num + num2 < 50){
            System.out.println("no");
        }else {
            System.out.println("？");
        }*/

        //练习2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();
        if(num > 10 & num2 < 10){
            System.out.println(num + num2);
        }else {
            System.out.println(num * num2);
        }
    }
}
