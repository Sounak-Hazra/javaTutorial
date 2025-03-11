public class basic {
    
    public static void printten(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printten(num-1);
    }
    public static void main(String args[]) {
        printten(10);
    }
}