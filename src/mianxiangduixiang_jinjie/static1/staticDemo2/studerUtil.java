package mianxiangduixiang_jinjie.static1.staticDemo2;

import java.util.ArrayList;

public class studerUtil {
    private studerUtil(){}

    //静态方法
    public static int getMaxAgeStudent(ArrayList<student> list){
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if ( tempAge> max){
                max = tempAge;
            }
        }
        return max;
    }
}
