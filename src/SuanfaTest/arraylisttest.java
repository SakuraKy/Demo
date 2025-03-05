package SuanfaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylisttest {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(ls.size());
        ArrayList<Integer> ls2 = new ArrayList<>(Collections.nCopies(5, 0));
        ls2.add(2);
        System.out.println(ls.isEmpty());
        System.out.println(ls2.get(ls2.size() - 1));
        ls.remove(ls.size() - 1);
        ls2.set(2, 3);
    }

}
