public class fangfa3 {
    public static void main(String[] args) {
        //方法的返回值是方法运行的最终结果

        //1.什么时候用到有返回值的方法?
        //在调用处要根据方法的结果，去编写另外一段代码


        /*带返回值方法格式:
        public static 返回值类型 方法名 (参数){
              方法体;
              return 返回值;
        }
         */

        /*带返回值方法的调用
        1.直接调用：方法名(实参);
        2.赋值调用：整数类型 变量名 = 方法名 （实参）;
        3.输出调用：System.out.println(方法名 (实参));
         */


        //需求:定义一个方法，求一家商场每个季度的营业额。
        //根据方法结果再计算出全年营业额。

        //先计算第一个季度的营业额
        int sum1 = getSum(10,20,30);
        //计算第二个季度的营业额
        int sum2 = getSum(40,20,30);
        //计算第三个季度的营业额
        int sum3 = getSum(50,40,30);
        //计算第四个季度的营业额
        int sum4 = getSum(60,50,40);

        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }
    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 +num3;
        return result;
    }
}
