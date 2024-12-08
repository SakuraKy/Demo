public class shuzu3 {
    public static void main(String[] args) {
        //数组元素访问
        //格式：数组名[索引];
        //索引：也叫做下表，角标。特点：从0开始，逐个+1增长，连续不间断

        //需求：利用索引对数组的元素进行访问

        //1.获取数组里面的元素
        int[] arr = {1,2,3,4,5};
        //获取数组中的第一个元素
        int number = arr[0];
        System.out.println(number);
        //2.把数据存储到数据当中
        //格式：数组名[索引] = 具体数据/变量;
        arr[4] = 100;
        System.out.println(arr[4]);

        //索引越界异常
        //原因：访问了不存在的索引；避免：只要知道索引的范围
    }
}
