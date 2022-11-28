// Merge two sorted arrays

// Given two sorted arrays, the task is to merge them in a sorted manner.
// Examples: 

// Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
// Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

// Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
// Output: arr3[] = {4, 5, 7, 8, 8, 9} 

import java.util.*;

public class MergeWithoutExtraSpace {

    static void mergeArrays(int a[], int b[], int n, int m) {

        Map<Integer, Boolean> mp = new TreeMap<Integer, Boolean>();

        for (int i = 0; i < n; i++) {
            mp.put(a[i], true);
        }
        for (int i = 0; i < m; i++) {
            mp.put(b[i], true);
        }

        for (Map.Entry<Integer, Boolean> me : mp.entrySet()) {
            System.out.print(me.getKey() + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 7 }, b[] = { 2, 4, 6, 8 };
        int size = a.length;
        int size1 = b.length;

        mergeArrays(a, b, size, size1);
    }
}
