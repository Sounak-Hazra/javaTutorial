public class selectionSort {

    public static void insertion(int arr[]) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp; 
        }
    }
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 7, 0, 9, 1 };
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
