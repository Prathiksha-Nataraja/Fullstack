package Sample;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Abi", "123");
        map.put("Abhay", "456");
        map.put("Akshay", "789");

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
