import java.util.*;
public class studentPassOrFail {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int marks = 33;
        // int return = (marks>=33)?System.out.println("Pass"):System.out.println("Fail");
        // System.out.println(System.out.println(10));

        String gread = (marks >= 33) ? "Pass" : "fail";
        System.out.println(gread);

    }
}
