public class fangfa2 {
    public static void main(String[] args) {
        /*带参数的方法定义格式：
        public static void 方法名(参数1,参数2,...){.....}
         */

        /*带参数的方法调用格式：
        方法名(参数1,参数2,...)；
         */

        //注意：方法调用时，参数的数量与类型必须与方法定义中小括号里面的值一一对应，否则程序将报错

        getSum(10,20);
    }

    public static void getSum(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
