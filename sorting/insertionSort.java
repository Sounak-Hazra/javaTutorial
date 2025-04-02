public class insertionSort {
    public static void issertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;
            while (prev >= 0 && temp < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
           
        }
    }
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 7, 0, 9, 1 };
        issertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
