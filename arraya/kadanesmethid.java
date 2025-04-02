import java.util.*;
public class kadanesmethid {
    public static void subArraySum(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            sum = Math.max(0, sum);
            max = Math.max(max, sum);
        }
        System.out.println(max);
        
    }

    public static void main(String args[]) {
        int arr[] = { -2,-3,4,-1,-2,1,5,-3};
        subArraySum(arr);
    }

}
