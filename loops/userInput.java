import java.util.*;

public class userInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i=1;
        while (i <= limit) {
            System.out.println(i);
            i++;
        }
    }
}
