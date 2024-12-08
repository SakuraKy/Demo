import java.util.Scanner;

public class guanxiyunsuanfu {
    public static void main(String[] args) {
        //关系运算符都是布尔类型的，结果要么是true要么是false。
        //1.==,判断左右两边是否相等。
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println("------------");

        //2.!=,判断左右两边是否不相等。
        System.out.println(a != b);
        System.out.println(a != c);

        System.out.println("--------------");

        /*练习：
        您和您的约会对象在餐厅里面正在约会。
        键盘录入两个整数，表示你和你约会对象衣服的时髦度。(手动录入0~10之间的整数，不能录其他)
        如果你的时髦程度大于你对象的时髦程度，相亲就成功，
        输出true。
        否则输出false。
         */
        //1.键盘录入2个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入男方的时髦度：");
        int my = sc.nextInt();
        System.out.println("请输入女方的时髦度：");
        int you = sc.nextInt();

        //2.时髦度对比
        boolean result = my > you;

        //3.打印结果
        System.out.println(result);
    }
}
