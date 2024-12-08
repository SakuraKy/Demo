public class fangfa2_2 {
    public static void main(String[] args) {
        //形参：全称形式参数是指方法定义中的参数

        //实参：全称实际参数，方法调用中的参数

        /*方法定义的技巧：
        1.我要干什么（方法体）
        2.我干这件事需要什么才能完成（形参）
         */

        //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印

        getLength(3,2);

        //需求：定义一个方法，求园的面积，将结果在方法中进行打印
        yuanS(3);
    }
    public static void getLength(double len,double width){
        double result =(len + width)*2;
        System.out.println(result);
    }
    public static void yuanS(double r){
        double s = 3.14*(r*r);
        System.out.println(s);
    }
}
