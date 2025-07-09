import java.util.*;

class Solution{

    public static void main(String args[]) {
        
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 140);
        hm.put("Chaina", 150);
        hm.put("Palistan", 50);
        hm.put("Russia", 70);
        hm.put("US", 20);

        System.out.println(hm);

        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println(hm.get(k));
        }
        
    }
}