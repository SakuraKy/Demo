package SuanfaTest;

import java.util.HashMap;
import java.util.Map;

public class haxibiao {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        bianli(map);
    }

    public static void bianli(Map<Integer, String> m) {
        for (Map.Entry<Integer, String> kv : m.entrySet()) {
            System.out.println(kv.getKey() + "->" + kv.getValue());
        }
    }

}
