public class reverse1ton {
    public static void reverse(int n) {
        if (n == 0) {
            return;
        }
        reverse(n - 1);
        System.out.println(n);
    }

    public static void main(String args[]) {
        reverse(10);
    }
}
