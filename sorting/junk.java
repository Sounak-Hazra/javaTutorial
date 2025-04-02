public class junk {
    
    public static void issertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i; j >=0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                }
                else {
                    arr[i] = temp;
                }
            }
        }
    }
}
