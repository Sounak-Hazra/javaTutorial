public class QuickSort {

    static int calcPivot(int arr[], int start, int end) {
        int temp = arr[end];
        int j = start - 1;
        for (int i = start; i < end; i++) {
            if (arr[i] <= temp) {
                j++;
                int temp2 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp2;
            }
        }
        j++;
        int temp2 = arr[j];
        arr[j] = temp;
        arr[end] = temp2;
        return j;
    }

    static void Sort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = calcPivot(arr, start, end);
        Sort(arr, start, pivot-1);
        Sort(arr, pivot + 1, end);
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 6, 7, 1, 2, 3 };
        Sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
