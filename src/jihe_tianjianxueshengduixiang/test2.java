package jihe_tianjianxueshengduixiang;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        //添加学生对象
        //键盘录入学生信息，并添加到集合
        for (int i = 0; i < 3; i++) {
            student s = new student();
            System.out.println("请输入学生名字：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();

            //把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //把学生对象添加到集合
            list.add(s);

        }

        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }
    }
}
