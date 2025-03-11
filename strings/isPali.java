public class isPali {

    public static boolean ispalidrom(String str) {
        String str2 = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     str2 = str2 + str.charAt(i);
        // }
        // System.out.println(str);
        // System.out.println(str2);
        // if (str == str2) {
        //     return true;
        // }
        // return false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String s = "racecar";
        System.out.println(ispalidrom(s));
    }
}