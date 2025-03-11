import java.util.*;
public class printSubarray {
    public static void subArraySum(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (min > sum) {
                    min = sum;
                }
                if (max < sum) {
                    max = sum;
                }
                sum = 0;
                System.out.println();
            }
        }
        
        System.out.println("Min is " + min + "\tMax is " + max);
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, };
        subArraySum(arr);
    }
}
