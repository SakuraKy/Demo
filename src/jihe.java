import java.util.ArrayList;

public class jihe {
    public static void main(String[] args) {
        //需求：创建一个集合，遍历集合，格式：[元素1，元素2， ....]

        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型（就是尖括号）
        //JDK7以前：后面泛型需要写。JDK7以后：后面泛型不需要写，可以省略
        ArrayList<String> list = new ArrayList<String>();//JDK7以前的写法

        //长度：list.size()

        //2.添加元素
        list.add("学习了吗？");
        list.add("学会了吗？");
        list.add("懂了吗？");

        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1 ){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");

    }
}
