package com.lc.codility.challenges.numerics.arrayPartitionPoint.solutions;

public class ArrayPartitionPoint {

    /**
     * Algorithm Complexity Analysis: O(N^2)
     *
     * Prints an element such than all elements on left are smaller and all elements on right are greater.
     */
    public int findPartitionPoint(int[] A, int n)
    {
        // traverse array elements
        for (int i = 0; i < n; i++) {

            // If we found that such number
            int flag = 0;

            // check All the elements on its left are smaller
            for (int j = 0; j < i; j++)
                if (A[j] >= A[i]) {
                    flag = 1;
                    break;
                }

            // check All the elements on its right are Greater
            for (int j = i + 1; j < n; j++)
                if (A[j] <= A[i]) {
                    flag = 1;
                    break;
                }

            // If flag == 0 indicates we found that number
            if (flag == 0)
                return A[i];
        }
        return -1;
    }
}
