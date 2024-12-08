public class kuaisupaisudemo {
    public static void main(String[] args) {
        public class kuaisupaixu {
            public static void main(String[] args) {
                int[] arr = {1,5,3,7,9,4,6,8,2};

                quickSort(arr, 0, arr.length - 1);

                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + " ");
                }
            }


            /*参数一：我们要排序的数组
             * 参数二：要排序数组的其实索引
             * 参数三：要排序数组的结束索引
             */
            public static void quickSort(int[] arr,int i ,int j){
                //定义两个变量记录要查找的范围
                int start = i;
                int end = j;

                //记录基准数
                int baseNumber = arr[i];

                //利用循环找到要交换的数字
                while (start != end) {
                    //利用end从后往前开始找,找比基准数小的数字
                    while(true){
                        if (end <= start || arr[end] < baseNumber) {
                            break;
                        }
                        end--;
                    }
                }
                //利用start从前往后开始找，找比基准数大的数字
                while(true){
                    if (end <= start || arr[start] > baseNumber) {
                        break;
                    }
                    start++;
                }
                //把end位置的数字和start位置的数字进行交换
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            //当start和end相等的时候，此时应该把基准数和start位置的数字进行交换
            //基准数归位
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;

        }
    }

}

