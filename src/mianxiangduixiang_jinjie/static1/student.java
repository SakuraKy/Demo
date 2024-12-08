package mianxiangduixiang_jinjie.static1;

public class student {
    private String name;
    private  int age;
    private  String gender;
    //在private后面+static表示student这个类所有的对象都共享同一个对象
    public static String teacher;

    public student() {
    }

    public student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show(){
        System.out.println(name + "," + age + "," + gender + "," + teacher);
    }
}

