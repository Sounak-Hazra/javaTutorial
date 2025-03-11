public class characterPatern {
    public static void main(String[] args) {
        char a = 65;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                a += 1;
            }
            System.out.println();
        }
    }
}
