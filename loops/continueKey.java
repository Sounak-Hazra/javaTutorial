import java.util.*;
public class continueKey {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter the number :");
            num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            else {
                System.out.println(num);
            }
        }
    }
}
