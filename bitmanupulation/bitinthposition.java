import java.util.*;
public class bitinthposition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the position : ");
        int pos = sc.nextInt();
        int bitmass = 1 << pos;
        if ((num & bitmass) == 0) {
            System.out.println("The number is 0");
        }
        else {
            System.out.println("The number is 1");
        }
    }
}
