public class ifDemo1_1 {
    public static void main(String[] args) {
        //小红：如果你考试第一，我就做你女朋友

        //1.定义变量记录小明考试名次
        int ranking = 1;
        //2.对小明的名次进行判断
        if(ranking == 1){
            System.out.println("小红成为了小明的女朋友");
        }

        //练习：自动驾驶
        //1.定义三个灯的变量，true=灯亮 false=灯灭
        boolean isLightGreen = false ;
        boolean isLightYeloow = false ;
        boolean isLightRed = true ;
        //2.判断
        if(isLightGreen){
            System.out.println("go!go!go!");
        }
        if(isLightYeloow){
            System.out.println("slow!");
        }
        if(isLightRed){
            System.out.println("stop!");
        }
    }
}
