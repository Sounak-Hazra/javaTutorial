public class biggestString {
    public static String biggest(String s[]) {
        String biggest = s[0];
        for (int i = 1; i < s.length; i++) {
            if (biggest.compareTo(s[i]) < 0) {
                biggest = s[i];
            }
        }
        return biggest;
    }

    public static void main(String args[]) {
        String arr[] = {  "banana","mango", "kela", "lebu" };
        System.out.println(biggest(arr));
    }
}

