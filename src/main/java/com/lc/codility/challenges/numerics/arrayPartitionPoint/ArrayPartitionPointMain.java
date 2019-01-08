package com.lc.codility.challenges.numerics.arrayPartitionPoint;

import com.lc.codility.challenges.numerics.arrayPartitionPoint.solutions.ArrayPartitionPoint;

import java.util.Arrays;

public class ArrayPartitionPointMain {

    public static void main(String[] args) {

        ArrayPartitionPoint partitioner = new ArrayPartitionPoint();

        int[] testArr = {4, 3, 2, 5, 8, 6, 7};
        System.out.println(Arrays.toString(testArr));
        System.out.println("partition point =" + partitioner.findPartitionPoint(testArr, testArr.length));

        int[] testArrWrong = {5, 6, 2, 8, 10, 9, 8};
        System.out.println(Arrays.toString(testArrWrong));
        System.out.println("partition point =" + partitioner.findPartitionPoint(testArrWrong, testArrWrong.length));
    }
}
