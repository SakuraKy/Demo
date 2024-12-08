package jihe_tianjianxueshengduixiang;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();

        student s1 = new student("zhangsan",23);
        student s2 = new student("lisi",24);

        list.add(s1);
        list.add(s2);

        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }

    }
}
