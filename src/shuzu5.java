public class shuzu5 {
    public static void main(String[] args) {
        //动态初始化：初始化时只指定数组长度，由系统为数组分配初始值
        //格式：数据类型[] 数组名 = new 数据类型[数组长度];

        //需求：定义一个数组，用来存班级中50个学生的姓名，姓名未知，等学生报道之后，再进行添加

        String[] arr = new String[50];
        //添加学生的姓名
        arr[0] = "张三";
        System.out.println(arr[0]);

        //数组默认初始化值的规律
        //整数：默认初始化值为0
        //小数：0.0
        //字符：'\u0000' （展示方式为空格）
        //布尔：false
        //引用数据：null
    }
}
