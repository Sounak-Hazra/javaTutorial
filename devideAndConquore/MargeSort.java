public class MargeSort {

    static void sort(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;k++;
            }
            if (arr[i] >= arr[j]) {
                temp[k] = arr[j];
                j++;k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int e = start; e <= end; e++) {
            arr[e] = temp[e - start];
        }
    }

    static void marge(int arr[], int start, int end) {
        int mid = (start + end) / 2;
        if (start >= end) {
            return;
        }
        marge(arr, start, mid);
        marge(arr, mid + 1, end);
        sort(arr, start, mid, end);
    }
    
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 2, 3, 8, 3, 4, 1 };
        marge(arr, 0, arr.length - 1);
        printArr(arr);
    }
}