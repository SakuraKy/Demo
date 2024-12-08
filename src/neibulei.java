public class neibulei {
    
        //需求：写一个Javabean
        //属性：汽车品牌，车龄，颜色，发动机的品牌，使用年限

        //内部类的访问特点：
        //1.内部类可以直接访问外部类的所有成员，包括私有的
        //2.外部类不能访问内部类的成员，包括私有的，必须创建对象

        String carName;
        int carAge;
        String carColor;
        

        public void show(neibulei this){
            System.out.println(carName);
            System.out.println(carAge);
            System.out.println(carColor);

            Engine engine = new Engine();
            System.out.println(engine.engineName);
        }



        class Engine{
            String engineName;
            int engineAge;

            public void show(){
                System.out.println(engineName);
                System.out.println(carName);
            }
        } 
}
