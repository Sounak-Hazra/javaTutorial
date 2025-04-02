import java.util.*;             ;
public class Solution {

    static int search(String s,String w) {
        int val = s.indexOf(w);
        return val;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String word = sc.next();

        int res = search(s, word);

        System.out.println(res);
    }
}
