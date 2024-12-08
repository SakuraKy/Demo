public class shuzu4_2 {
    public static void main(String[] args) {
        //定一个数组，数组遍历出每个数字，且统计能被3整除的个数
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i] % 3 ==0){
                sum++;
            }
        }
        System.out.println("能被3整除的个数：" + sum);
    }
}
