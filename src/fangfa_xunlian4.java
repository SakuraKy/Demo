public class fangfa_xunlian4 {
    public static void main(String[] args) {
        /*需求：定义一个方法copyOfRange(int[] arr,int from, int to)
        将数组arr中从索引from(包含from)开始。
          功能：到索引to结束(不包含to)的元素复制到新数组中
        将新数组返回。
         */
        int [] arr = {1,2,3,4,5,6,7,8,9};

        int[] copy = copyOfRange(arr, 3, 7);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " " );
        }

    }
    public static int[] copyOfRange(int[] arr,int from, int to){
        //1.定义数组
        int[] newArr = new int[to - from];
        //伪造索引思想
        //用法：当现场没有任何一个变量当作索引时，可以设置一个变量，=0，后续进行变量++即可
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr [index] = arr[i];
            index++;
        }
        return newArr;
    }
}
