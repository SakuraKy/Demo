public class VariableDemo2 {
    public static void main(String[] args){
        //1.变量的基本用法
        //定义变量，再进行输出
        int a = 10;
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        //2.变量参与计算
        int b = 10;
        int c = 20;
        System.out.println(b + c);

        //3.修改变量记录的值
        a = 50;
        System.out.println(a);

        System.out.println("-----------------------------------");

        //注意事项
        //在一条语句中，可以定义多个变量
        int d = 100,e = 200,f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        /*只能存在一个值
        变量名不允许重复定义
        一条语句可以定义多个变量
        变量在使用之前一定进行赋值
        变量的作用域范围
         */
    }
}
