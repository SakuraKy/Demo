public class fangfa_xunlian3 {
    public static void main(String[] args) {
        //需求：定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int[] arr = {1,2,3,4,5,6,7,8,9};

        boolean a = num(arr,7);
        System.out.println(a);
    }
    public static boolean num(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
//return:跟循环没关系，跟方法有关系，表示结束方法，返回结果
//如果方法执行到return，那么整个方法全部结束，里面的循环也随之结束
//break：跟方法没关系，结束循环或者switch有关的