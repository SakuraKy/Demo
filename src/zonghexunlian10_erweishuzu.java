public class zonghexunlian10_erweishuzu {
    public static void main(String[] args) {
        //二维数组：数组里再套进数组，最外面的数组叫二维数组。
        //应用场景：需要吧数据分组管理的时候，就要用到二维数组。

        /*静态初始化格式
        数据类型[][] 数组名 = new 数据类型[][] {{元素1，元素2},{元素1，元素2}};
        简化：数据类型[][] 数组名 ={{元素1，元素2},{元素1，元素2}};
         */

        //元素访问：数组名[索引][索引]；

        //二位数组遍历：先得到一堆数组，再遍历一堆数组获取元素

        //建议这样定义，把每个一维数组，单独写成一行
        //注意：每一个一维数组其实是二维数组中的元素，所以每一个一位数组之间需要用逗号隔开，最后一个一维数组后面不需要加逗号
        int[][] arr = new int[][] {
                {1,2,3},
                {4,5,6,7,8}
        };

        //获取元素
        System.out.println(arr[0][0]);//1
        //arr[0]:表示二维数组中的第一个一维数组
        //arr[0][0]:表示获取二维数组中第一个一维数组中的第一个元素
        
        
        //二维数组遍历
        //外循环：遍历二维数组，得到里面的一维数组
        //内循环：遍历一维数组，得到里面的每一个元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //j:表示一维数组中的每一个元素
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //二维数组的动态初始化
        /*格式：
        数据类型[][]数组名 = new 数据类型[m][n];
        m:表示这个二维数组可以存放多少个一维数组
        n:表示一维数组可以存放多少个元素
         */


        //利用动态初始化格式创建二维数组
        int[][] brr = new int[3][5];
        //给二维数组赋值一个元素
        brr[0][0] = 10;
        //遍历二维数组
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                System.out.print(brr[i][j] + " ");
            }
        }

        /*某商城每个季度的营业额如下:单位(万元)
        第一季度:22,66,44
        第二季度:77,33,88
        第三季度:25,45,65
        第四季度:11,66,99
        要求计算出每个季度的总营业额和全年的总营业额
         */

        int[][] yearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99},
        };


        int yearSum = 0;
        //遍历二维数组，得到每个一维数组并求和
        for (int i = 0; i < yearArrArr.length; i++) {
            //二维数组中的每一个索引
            int[] quartArr = yearArrArr[i];
            int sum = getSum(quartArr);
            System.out.println("第" + (i + 1) + "季度的总营业额：" + sum);
            yearSum = yearSum + sum;
        }
        System.out.println("全年的总营业额：" + yearSum);
    }
    //定义一个方法计算每个季度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
