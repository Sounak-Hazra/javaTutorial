import java.util.*;
public class Solution {
    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        // l1.add(3, 2);

        // l1.remove(2);

        // l1.get(2);

        // System.out.println(l1.contains(2));

        // l1.set(2, 100);

        // System.out.println(l1);

        // System.out.println(l1.size());

        // printReverse(l1);

        // System.out.println(maxValue(l1));

        // swap(l1, 0, 3);
        // System.out.println(l1);

        // Collections.sort(l1);
        // System.out.println(l1);

        // Collections.sort(l1, Collections.reverseOrder());
        // System.out.println(l1);


        // Multi dimensonal array list 
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<Integer> l4 = new ArrayList<>();

        mainList.add(0, l2);
        mainList.add(1, l3);
        mainList.add(2, l4);

        for (int i = 0; i <= 5; i++) {
            l2.add(i, i);
            l3.add(i, i * 2);
            l4.add(i, i * 3);
        }
        
        System.out.println(mainList);

    }
    
    static void printReverse(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }

    static int maxValue(ArrayList<Integer> arr) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    static void swap(ArrayList<Integer> arr,int first,int second) {
        int temp = arr.get(first);
        arr.set(first, arr.get(second));
        arr.set(second, temp);
    }
}