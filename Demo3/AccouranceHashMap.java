package Demo3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccouranceHashMap {
    public static void main(String[] args) {
        String s ="Ritwik";
        occour(s);
    }

    public static void occour(String s){
        char[] ch = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(Character c : ch){
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Character> set = map.keySet();
       for(Character m : set){
            System.out.println(m+"->"+map.get(m));
       }
    }
}
