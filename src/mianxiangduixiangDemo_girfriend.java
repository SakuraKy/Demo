public class mianxiangduixiangDemo_girfriend {
    //private；数据的安全性,是个权限修饰符，可以修饰成员（成员变量，成员方法）
    //被private修饰的成员只能在本类中才能访问
    //如果需要被其他的类使用，则提供set、get方法（方法用public修饰）



    //属性
    private String name;
    private int age;
    private String gender;



    //针对每一个私有化变量，提供set，get方法
    //set:给成员变量赋值
    //get:给外提供成员变量的值

    public void setName(String name){//作用：给成员变量name进行赋值
        this.name = name;
        //局部变量表示测试类中调用方法传递过来的数据
        //“=”的左边：表示成员位置的name。
    }
    public String getName(){//作用：对外提供name属性
        return name;
    }


    public void setAge(int age){
        if (age >= 18 && age <= 50){
            this.age = age;
        }else {
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }


    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    //行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
