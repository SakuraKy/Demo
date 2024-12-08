package mianxiangduixiang_jinjie.nimingneibulei;

public class Test {

    

    public static void main(String[] args) {
        /*匿名内部类格式：
         * new 类名/接口(){
         * 重写方法；
         * };
         */


         //编写匿名内部类的代码
         new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
                
         };
        
        
        
         };
    }    
    

}
