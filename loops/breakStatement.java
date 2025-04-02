import java.util.*;
public class breakStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter number :");
            num = sc.nextInt();
        } while (num % 10 != 0);
    }
}
