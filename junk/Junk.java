// public class Junk {
//     public static void bubbleSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j + 1];
//                     arr[j + 1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }

//     public static void insertionSort(int arr[]) {
//         int key, j;
//         for (int i = 1; i < arr.length; i++) {
//             key = arr[i];
//             j = i - 1;
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = key;
//         }
//     }

//     public static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             int min = i;
//             for (int j = i; j < arr.length; j++) {
//                 if (arr[j] < arr[min]) {
//                     min = j;
//                 }
//             }
//             int temp = arr[min];
//             arr[min] = arr[i];
//             arr[i] = temp;

//         }
//     }

//     public static int calcPivot(int arr[], int start, int end) {
//         int temp = arr[end];
//         int j = start - 1;
//         for (int i = start; i < end; i++) {
//             if (arr[i] <= temp) {
//                 j++;
//                 int temp2 = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp2;
//             }
//         }
//         j++;
//         arr[end] = arr[j];
//         arr[j] = temp;
//         return j;
//     }

//     public static void quickSort(int arr[],int start,int end) {
//         if (start >= end) {
//             return;
//         }
//         int pivot = calcPivot(arr, start, end);
//         quickSort(arr, start, pivot - 1);
//         quickSort(arr, pivot+1, end);

//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = { 8, 8, 8, 6, 4, 5, 7, 6, 41, 7, 4, 3685, 4, 5, 7, 64, 47, 6, 4 };
//         quickSort(arr,0,arr.length-1);
//         printArr(arr);
//     }
// }

// public class Junk {
//     public static void main(String args[]) {
//         // for (int i = 0; i <= 10; i++) {
//         //     System.out.print(i  + " ") ;
//         // }

//         // while () {

//         //     System.out.println("hello");
//         // }
// // do{

// // }while();
// //     }
// }

public class Junk {
    public static void main(String main[]) {

    }
}