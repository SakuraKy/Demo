package API.Math;

public class math {
    public static void main(String[] args) {
        //abs 获取绝对值 取值范围：-2147483648~2147483647
        //如果没有整数与负数对应，传递负数结果有误
        System.out.println(Math.absExact(-5));


        //ceil 向上取整
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.ceil(-5.5));

        //floor 向下取整
        System.out.println(Math.floor(5.5));
        System.out.println(Math.floor(-5.5));

        //round 四舍五入
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(-5.5));

        //max 取最大值
        System.out.println(Math.max(5, 10));
        System.out.println(Math.max(-5, -10));

        //min 取最小值
        System.out.println(Math.min(5, 10));
        System.out.println(Math.min(-5, -10));

        //pow 获取幂
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, -2));

        //sqrt 获取平方根
        System.out.println(Math.sqrt(9));
    }

}
