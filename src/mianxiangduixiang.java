public class mianxiangduixiang {
    public static void main(String[] args) {
        /*面向对象介绍
        面向:拿、找
        对象:能干活的东西
        面向对象编程:拿东西过来做对应的事情
         */

        //类（设计图）:是对象共同特征的描述
        //对象：是真实存在的具体东西
        //在java中必须先设计类，才能获得对象。

        /*1、成员变量(代表属性,一般是名词)
        2、成员方法(代表行为,一般是动词)
        3、构造器
        (后面学习)
        4、代码块
        (后面学习)
        5、内部类
        (后面学习)
         */


        /*如何得到类的对象
        类名 对象名 = new 类名();
        phone p = new phone();
         */


        phone_mianxiangduixiang p = new phone_mianxiangduixiang();

        /*如何使用对象
        访问属性:对象名.成员变量
        访问行为:对象名.方法名(...)
         */

        p.brand = "小米";
        p.price = 1999.2;

        //获取手机对象中值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();


        /*定义类的补充注意事项
        用来描述一类事物的类，专业叫做:Javabean类
        在Javabean类中，是不写main方法的。
        在以前，编写main方法的类，叫做测试类
        我们可以在测试类中创建javabean类的对象并进行赋值调用。

        类名首字母建议大写，需要见名知意，驼峰模式。
        一个ava文件中可以定义多个class类，且只能一个类是public修饰，而且public修饰的类名必须成为代码文件名
        实际开发中建议还是一个文件定义一个class类。
        成员变量的完整定义格式是:
        修饰符 教据类型 变量名称=初始化值;  一般无需指定初始化值，存在默认值。
         */
    }
}
