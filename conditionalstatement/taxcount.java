import java.util.*;
public class taxcount{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float sallary = sc.nextInt();
        int tax;

        if (sallary < 500000) {
            System.out.println("You no need to give any tax !");
        }
        else if (sallary > 500000 && sallary <= 1000000) {
            System.out.println("Your tax is " +(int) (sallary * 0.2));
        }
        else {
            System.out.println("Your tax is " +(int) (sallary * 0.3));
        }
    }
}