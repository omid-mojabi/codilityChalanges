package com.lc.codility.utils;

public class QuickSortImpl {

    //Algorithm Complexity Analysis: O(n log n)
    public void quickSort(int[] array) {
        if (array == null || array.length == 0) return;
        int lowerIndex = 0;
        int higherIndex = array.length - 1;
        sort(array, lowerIndex, higherIndex);
    }

    private void sort(int[] array, int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapInArray(array, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            sort(array, lowerIndex, j);
        if (i < higherIndex)
            sort(array, i, higherIndex);
    }

    private void swapInArray(int[] array, int leftElementIndex, int rightElementIndex) {
        int tmp = array[leftElementIndex];
        array[leftElementIndex] = array[rightElementIndex];
        array[rightElementIndex] = tmp;
    }

}
