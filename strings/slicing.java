public class slicing {

    public static String slice(String str, int st, int ed) {
        String s = "";
        for (int i = st; i < ed; i++) {
            s += str.charAt(i);
        }
        return s;
    }
    public static void main(String args[]) {
        String s = "sounak";
        System.out.println(slice(s, 0, 3));
    }
}
