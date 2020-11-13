package com.learn.utils;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DSUtils {

    private static int[] ARR = {2,1,3,2,4,3,2,1,5,7,3,8,3,9,0,4,5};

    /*********** UTILITY FUNCTIONS FOR ARRAY ***********/

    public static int[] getUnsortedIntegerArrayWithSmallNumbers() {
        return ARR;
    }

    public static int[] getSortedIntegerArrayWithSmallNumbers() {

        int[] localCopyOfArr = ARR;
        Arrays.sort(localCopyOfArr);
        return localCopyOfArr;
    }

    public static int[] getUnsortedRandomIntegerArray() {
        Object[] srcArray = getRandomArray(false);
        return Arrays.stream(Arrays.copyOf(srcArray, 0, Integer[].class))
                .mapToInt(Integer::intValue).toArray();
    }

    public static int[] getSortedRandomIntegerArray() {
        Object[] srcArray = getRandomArray(true);
        return Arrays.stream(Arrays.copyOf(srcArray, 0, Integer[].class))
                .mapToInt(Integer::intValue).toArray();
    }

    public static void printArray(int[] arr, String msg) {
        System.out.print(msg + " :- ");
        Arrays.stream(arr)
                .forEach(i -> System.out.print(i + "\t"));
    }

    private static Object[] getRandomArray(boolean sorted) {
        return IntStream.rangeClosed(1,20)
                .limit(10)
                .boxed()
                .collect(Collectors.toList())
                .toArray();
    }
}
