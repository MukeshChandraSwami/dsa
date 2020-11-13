package com.learn.array;

import com.learn.utils.DSUtils;

/**
 * https://www.geeksforgeeks.org/array-rotation/
 */
public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = DSUtils.getSortedIntegerArrayWithSmallNumbers();

        int d = 5;

        DSUtils.printArray(arr, "Before Rotation");
        rotateArray(arr, d);
        DSUtils.printArray(arr, "\n\nAfter Rotation");
    }

    /**
     * @param arr
     * @param d
     *
     * Worst case : O(n * n)
     * Best and Avg case : O(n * d)
     */
    public static void rotateArray(int[] arr, int d) {

        for(int i = 0; i < d; i++) {
            int tmp = arr[0];

            for(int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = tmp;
        }
    }
}
