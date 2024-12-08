import java.util.ArrayList;

public class jihe2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //JDK5以后int Integer可以相互转换
        list.add(1);
        list.add(2);
        list.add(3);
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
