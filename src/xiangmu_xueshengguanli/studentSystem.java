package xiangmu_xueshengguanli;

import mianxiangshuzu.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {// loop作用：标记，可以用来跳出标记的这个循环
            System.out.println("---------------------学生管理系统-------------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");
            try (Scanner sc = new Scanner(System.in)) {
                String choose = sc.next();
                switch (choose) {
                    case "1":
                        addStudent(list);
                        break;
                    case "2":
                        deleteStudent(list);
                        break;
                    case "3":
                        updateStudent(list);
                        break;
                    case "4":
                        queryStudent(list);
                        break;
                    case "5":
                        System.out.println("退出");
                        break loop;// 跳出2层循环，第二种方法：System.exit(o);这个表示停止虚拟机运行
                    default:
                        System.out.println("没有这个选项");
                        break;

                }
            }
        }
    }

    // 添加
    public static void addStudent(ArrayList<Student> list) {
        mianxiangshuzu.Student stu = new mianxiangshuzu.Student();
        try (Scanner sc = new Scanner(System.in)) {
            String id = null;
            while (true) {
                System.out.println("请输入学生id：");
                id = sc.next();
                boolean flag = contains(list, id);
                if (flag) {
                    // id存在
                    System.out.println("id重复，请重新输入");
                } else {
                    stu.setId(id);
                    break;
                }
            }

            System.out.println("请输入学生姓名：");
            String name = sc.next();
            stu.setName(name);
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            stu.setAge(age);
        }
        list.add(stu);

    }

    // 查询
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息");
            return;
        }
        // 执行到这代表有学生信息
        // 打印表头信息
        System.out.println("id/t姓名/t年龄");
        for (int i = 0; i < list.size(); i++) {
            Student stu = new Student();
            System.out.println(stu.getId() + stu.getName() + stu.getAge());
        }
    }

    // 判断id是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        // 遍历集合得到信息
        // 拿着信息与输入的id作比较
        // true：已经有相同id
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = String.valueOf(s.getId());
            if (sid.equals(id)) {
                return true;
            }
        }
        return false;
    }

    // 通过id获取索引
    public static int getIndex(ArrayList<Student> list, String id) {
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 得到每一个学生对象
            Student stu = list.get(i);
            // 得到每一个学生对象的id
            String sid = stu.getId();
            // 拿着id与要删除的id进行比较，如果一样返回索引
            if (sid.equals(id)) {
                return i;
            }
        }
        // 当循环结束之后还没有找到，就表示不存在，返回-1
        return -1;
    }

    // 删除
    public static void deleteStudent(ArrayList<Student> list) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入要删除的id：");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index >= 0) {
                list.remove(index);
                System.out.println("id为：" + id + "的学生已经删除成功");
            } else {
                System.out.println("id不存在，删除失败");
            }
        }
    }

    // 修改
    public static void updateStudent(ArrayList<Student> list) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请输入要修改学生的id：");
            String id = sc.next();
            int index = getIndex(list, id);
            if (index == -1) {
                System.out.println("要修改的id不存在，请重新输入");
                return;

            }
            // 获取修改的学生对象
            Student stu = list.get(index);
            System.out.println("请输入要修改的学生姓名：");
            String newName = sc.next();
            stu.setName(newName);
            System.out.println("请输入要修改的学生年龄：");
            int newAge = sc.nextInt();
            stu.setAge(newAge);
        }
        System.out.println("学生信息修改成功");
    }

}
