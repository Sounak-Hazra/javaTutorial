public class decimalToBinary {
    public static int toBinary(int num) {
        int binary = 0;
        int size = 1;
        while (num != 0) {
            binary = binary + (num % 2)* size;
            num /= 2;
            size *= 10;
        }
        return binary;
    }

    public static void main(String args[]) {
        System.out.println(toBinary(2));
    }
}
