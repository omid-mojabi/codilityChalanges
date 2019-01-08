package com.lc.codility.challenges.numerics.arrayMaxSumSubseq;

import com.lc.codility.challenges.numerics.arrayMaxSumSubseq.solutions.ArrayMaxSumSubsequence;

import java.util.Arrays;

public class ArrayMaxSumMain {

    public static void main(String[] args) {
        ArrayMaxSumSubsequence maxSumSubsequence = new ArrayMaxSumSubsequence();
        int[] testArr = {1, 101, 2, 3, 100, 4, 5};
        System.out.println(Arrays.toString(testArr));
        System.out.println("Sum of maximum sum increasing subsequence is: " + maxSumSubsequence.maxSumIS(testArr,
                testArr.length));
        System.out.println("Sum of maximum sum increasing subsequence is: " + maxSumSubsequence.maxSubArraySum(testArr));

        int[] testArr2 = {-5, 6, 7, 1, 4, -8, 16};
        System.out.println(Arrays.toString(testArr2));
        System.out.println("Sum of maximum sum increasing subsequence is: " + maxSumSubsequence.maxSumIS(testArr2,
                testArr2.length));
        System.out.println("Sum of maximum sum increasing subsequence is: " + maxSumSubsequence.maxSubArraySum(testArr2));
    }
}
