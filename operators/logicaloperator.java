public class logicaloperator {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 10;

        if (a > b && b < c) {
            System.out.println("a grater than b and c grater than b");
        }


        if (b > a && b > c) {
            System.out.println("b grater than a and b grater than c");
        }

        boolean d = (b > a && b > c);
        System.out.println(d);
      
    }
}
