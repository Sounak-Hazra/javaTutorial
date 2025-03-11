public class emptyPattern {
    public static void main(String args[]){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i == 1 || i == 10) || (j == 1 || j == 10)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println("\n");
        }
    }
}
