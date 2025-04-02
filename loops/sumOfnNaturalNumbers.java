import java.util.*;

public class sumOfnNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= limit) {
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
        

    }
}
