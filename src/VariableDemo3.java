public class VariableDemo3 {
    public static void main(String[] args){
        //byte
        byte b = 10;
        System.out.println(b);
        //short
        short s = 20;
        System.out.println(s);
        //int
        int i = 30;
        System.out.println(i);
        //long
        //如果要定义long类型的变量
        //在数据值的后面需要加一个L作为后缀
        //L可以大写，也可以小写
        //建议:大写
        long n = 999999999L;
        System.out.println(n);


        //float
        //注意点：定义float类型变量的时候
        //数据值也需要加F后缀
        float f = 10.1F;
        System.out.println(f);
        //double
        double d = 20.2;
        System.out.println(d);


        //char
        char c = '中';
        System.out.println(c);


        //boolean
        //输出true,false
        boolean o = true;
        System.out.println(o);

        /*整数和小数取值范围大小关系
        double>float>long>int>short>byte
         */
    }
}
