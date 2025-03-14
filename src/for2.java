public class for2 {
    public static void main(String[] args) {
        /*需求:在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环。
            比如:求1-5之间的和
         */
        //用来累加的变量
        int sum = 0;
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
        /*注意事项：
        1.求和的变量不能在循环的里面，因为变量只在所属的大括号才有效。
        2.如果我们把变量定义在循环里面，那么当前变量只能在本次循环有效
          当本次循环结束之后，变量就会从内存中消失
          当第二次循环开始的时候，又会重新定义一个新的变量
         */
        //结论：如果要写累加求和的变量，可以把变量定义在循环外面。
    }
}
