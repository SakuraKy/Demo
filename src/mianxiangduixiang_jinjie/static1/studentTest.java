package mianxiangduixiang_jinjie.static1;

public class studentTest {
    public static void main(String[] args) {
        student.teacher = "阿宇";
        student s1 = new student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");

        s1.study();
        s1.show();

    }
}
