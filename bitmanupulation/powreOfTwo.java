import java.util.*;
public class powreOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num & num - 1) == 0) {
            System.out.println("Its a power of two");
        }
        else {
            System.out.println("Its not a power of two");
        }
    }
}