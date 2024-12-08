public class fangfa1 {
    public static void main(String[] args) {
        //方法是程序中最小的执行单元
        //方法的应用场景：重复的代码、具有独立单元功能的代码可以抽取到方法中
        //方法的好处：提高代码的复用性，提高代码的可维护性

        //方法定义：把一些代码打包在一起，该过程称为方法定义。
        //方法调用：方法定义后并不是直接运行，需要手动调用才能执行

        /*方法的定义格式：
        public static 返回值类型 方法名(参数) {
              方法体;
              return 返回值;
        }
        简单定义格式：
        public static void 方法名(){
              方法体（就是打包起来的代码）;
        }
         */


        /*方法的调用格式：
        方法名();
         */

        //注意：方法必须先定义后调用，否则程序将报错。

        //目标：掌握方法定义和调用



        //调用方法
        palyGame();

    }
    //定义一个方法
    public static void palyGame(){
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("gg");
    }
}
