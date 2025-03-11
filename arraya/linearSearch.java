public class linearSearch {

    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = { 5, 6, 78, 3, 5, 6, 8, 9, 12 };
        int key = 12;

        int index = search(arr, key);
        System.out.println(index);
    }
}
