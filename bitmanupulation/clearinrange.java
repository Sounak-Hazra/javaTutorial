public class clearinrange {
    public static int clearrange(int n, int i, int j) {
        int bitmass1 = ~(-1 << i-1);
        int bitmass2 = ~(-1 >> j);
        return n & (bitmass1 | bitmass2);  
    }
    public static void main(String args[]) {
        System.out.println(clearrange(38, 2, 3));
    }
}
