package SuanfaTest;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedlisttest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.addFirst(0);
        list.addLast(6);
        list.add(3, 33);
        list.remove();
        // 遍历链表
        for (Integer integer : list) {
            System.out.println(integer + " ");
        }
        System.out.println();

    }

}
