import java.util.*;
public class primeOrNot {
    public static void main(String args[]) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        int num = sc.nextInt();
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("This is not a prime number !");
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("This is a prime number");
        }
    }
}
