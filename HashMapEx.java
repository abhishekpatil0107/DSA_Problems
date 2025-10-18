import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 130);
        map.put("UK", 70);

        System.out.println(map);

        map.put("India", 150);
        System.out.println(map);

        if (map.containsKey("Chine")) {
            System.out.println("FOund");
        } else {
            System.out.println("Not Found");
        }

        int arr[] = { 14, 15, 60 };
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Iteration 1
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration 2
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // Removing
        map.remove("China");
        System.out.println(map);

    }

}
