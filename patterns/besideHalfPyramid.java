public class besideHalfPyramid {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= 1; j--) {
                if (j - i <= 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}