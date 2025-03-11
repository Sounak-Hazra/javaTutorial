public class fastExponential {
    public static int exponential(int num, int power) {
        int res = 1;
        while (power != 0) {
            if ((power & 1) != 0) {
                res *= num;
            }
            num *= num;
            power = power >> 1;
        }
        return res;
    }

    public static void main(String args[]) {
        System.out.println(exponential(3,2));
    }
}
