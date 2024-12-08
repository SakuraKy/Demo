package mianxiangduixiang_jinjie.static1.staticDemo2;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        //1.创建一个集合，存储学生对象
        ArrayList<student> list = new ArrayList<>();
        student stu1 = new student("zhangsan",16,"男");
        student stu2 = new student("lisi",23,"女");
        student stu3 = new student("wangwu",18,"男");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int MaxAge = studerUtil.getMaxAgeStudent(list);
        System.out.println(MaxAge);
    }
}
