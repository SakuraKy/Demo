public class shuzu1 {
    public static void main(String[] args) {
        // 数组：一种容器，可以储存同种数据类型的多个值。(存储数据时，需要结合隐式转换考虑)
        /*
         * 数组的定义：
         * 格式：
         * 1.数据类型 [] 数组名 例如：int [] array
         * 2.数据类型 数组名 [] 例如：int array []
         */
        // 数组的初始化：在内存中，为数组容器开辟空间，并将数据存入容器的过程。
        // 完整格式：数据类型[] 数组名 = new 数据类型[] {元素1,元素2,元素3,....};
        // 简化格式：数据类型[] 数组名 = {元素1，元素2，....};

        // 需求1：定义数组储存5个学生的年龄
        @SuppressWarnings("unused")
        int[] arr1 = { 11, 12, 13, 14, 15 };

        // 需求2：定义数组储存3个学生的姓名
        @SuppressWarnings("unused")
        String[] arr2 = { "张三", "李四", "王五" };

        // 需求3：定义数组储存4个学生的身高
        @SuppressWarnings("unused")
        double[] arr3 = { 163.2, 164.0, 175.1, 180.6 };
    }
}
