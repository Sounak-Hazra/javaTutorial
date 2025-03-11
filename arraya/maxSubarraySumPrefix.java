public class maxSubarraySumPrefix {

    public static void printmax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int temp[] = new int[arr.length];
        temp[0] = arr[0];
        for(int i=1;i<temp.length ;i++){
            temp[i] = temp[i-1] + arr[i];
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = i; j < temp.length; j++) {
                int val = i == 0 ? temp[j] : temp[j] - temp[i - 1];
                if (val > max) {
                    max = val;
                }
            }
        }
        System.out.println(max);
        
    }
    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        printmax(arr);
    }
}
