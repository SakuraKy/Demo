public class zonghexunlian4 {
    public static void main(String[] args) {
        //需求：把一个数组的元素复制到另一个数组中去

        //定义老数组
        int[] arr = {1,2,3,4,5};
        //定义新数组
        int[] newArr = new int[arr.length];
        //遍历老数组，将每个老数组中数字存入新数组中（i既是老数组的索引也是新数组的索引）
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //遍历新数组，输出新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
