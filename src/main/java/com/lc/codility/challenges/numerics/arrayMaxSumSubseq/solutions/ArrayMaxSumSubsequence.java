package com.lc.codility.challenges.numerics.arrayMaxSumSubseq.solutions;

public class ArrayMaxSumSubsequence {

    //Algorithm Complexity Analysis: O(N^2)
    public int maxSumIS(int arr[], int n)
    {
        int i, j, max = 0;
        int[] maxSumIs= new int[n];

    /* Initialize msis values for all indexes */
        for ( i = 0; i < n; i++ )
            maxSumIs[i] = arr[i];

    /* Compute maximum sum values in bottom up manner */
        for ( i = 1; i < n; i++ )
            for ( j = 0; j < i; j++ )
                if (arr[i] > arr[j] &&
                        maxSumIs[i] < maxSumIs[j] + arr[i])
                    maxSumIs[i] = maxSumIs[j] + arr[i];

    /* Pick maximum of all msis values */
        for ( i = 0; i < n; i++ )
            if ( max < maxSumIs[i] )
                max = maxSumIs[i];

        return max;
    }

    //Algorithm Complexity Analysis: O(N)
    public int maxSubArraySum(int a[])
    {
        int size = a.length;
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int i = 0; i < size; i++)
        {
            maxEndingHere = maxEndingHere + a[i];
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
}

