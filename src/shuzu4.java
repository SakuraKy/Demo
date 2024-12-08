public class shuzu4 {
    public static void main(String[] args) {
        //数组遍历：将数组中所有的内容取出来，取出后可以（打印，求和，判断...）
        //遍历是指取出数据的过程，不要局限的理解为，就是打印
        int[] arr = {1,2,3,4,5};
        //获取数组里面所有的元素
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/
        //可以利用循环改进代码
        //开始条件是0，结束条件是数组的长度-1（最大索引）
        //i:表示数组里面的每一个索引
        //关于数组的一个长度属性，length
        //调用方式：数组名.length
        //System.out.println(arr.length);

        //扩展：自动的快速生成数组的遍历方式
        //idea提供的，数组名.fori

        //练习：数组求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}
