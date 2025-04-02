public class countsetbits {

    public static int count(int num) {
        int count = 0;
        while (true) {
            if (num == 0) {
                return count;
            }
            else {
                if (!((num & 1) == 0)) {
                    count += 1;
                }
                num = num>>1;
            }
        }
    }
    public static void main(String args[]) {
        System.out.println(count(3));
    }
}
