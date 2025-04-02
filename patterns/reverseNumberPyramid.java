public class reverseNumberPyramid {
    public static void main(String args[]) {
        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= 1; j--) {
                if (i - j <= 0) {
                    System.out.print(count++);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count = 1;
        }
    }
}
