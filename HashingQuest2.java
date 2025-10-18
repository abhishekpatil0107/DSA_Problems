
//Union of two arrays

import java.util.HashSet;

public class HashingQuest2 {

    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr1[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 5, 6, 8, 3, 9 };
        int arr2[] = { 4, 6, 7, 3, };
        System.out.println(union(arr1, arr2));

    }

}
