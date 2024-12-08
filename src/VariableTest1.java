public class VariableTest1 {
    public static void main(String[] args){
        int count = 0;
        /*一开始没有乘客
        第一站：上去一位乘客
        第二站:上去两位乘客，下来一位乘客
        第三站：上去两位乘客，下来一位乘客
        第四站：下来一位乘客
        第五站：上来一位乘客
        请问：到了终点站，车上一共几位乘客
         */
        //在原有的基础上加1
        count = count + 1;
        count = count + 2 - 1;
        count = count + 2 - 1;
        count = count - 1;
        count = count + 1;
        System.out.println(count);
    }
}
