public class zifuchuanDemo5 {
    public static void main(String[] args) {
        //替换敏感词

        //截取说的话
        String talk = "你玩的真sb,cnmd";

        //创立脏字数据库
        String[] arr = {"nmsl" , "mlgb" , "sb" , "cnmd"};

        //利用循环，鉴别说的话是否与数据库中的脏词吻合
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i] ,"****");
        }

        //打印
        System.out.println(talk);
    }
}
