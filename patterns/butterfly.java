public class butterfly {
    public static void main(String args[]) {
        int num = 1400000;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i <= num / 2) {
                    if ((i - j) >= 0 || (j + i) > num) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                else {
                    if ((j - i) >= 0 || (i+j) <= num+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
