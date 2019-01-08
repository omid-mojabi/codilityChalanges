package com.lc.codility.challenges.strugacarroYear.solutions;

import com.lc.codility.challenges.strugacarroYear.solutions.utils.MinMaxPair;

public class StrugacarroYearSolutionFirst {

    public String solution(int[] T) {
        return getSeasonNameByAmplitude(T);
    }

    /**
     * solution internal calculation call method
     */
    private String getSeasonNameByAmplitude(int[] seasonRange) {
        int amplitude = calculateAmplitude(seasonRange);
        final String[] seasonsName = new String[]{"WINTER", "SPRING", "SUMMER", "AUTUMN"};
        return "";
    }

    /**
     * The amplitude is the difference between the highest and lowest temperatures over the given period
     */
    private int calculateAmplitude(int[] seasonRange) {
        MinMaxPair pair = getMinMax(seasonRange, 0, seasonRange.length - 1);
        return  Math.abs(pair.getMax() - pair.getMin());
    }

    /**
     * Recursive solution to find minimum and maximum value in an array of integers
     */
    private MinMaxPair getMinMax(int arr[], int low, int high) {

        MinMaxPair result = new MinMaxPair(0, 0);
        MinMaxPair left;
        MinMaxPair right;

        if (low == high) {
            result.setMax(arr[low]);
            result.setMin(arr[low]);
            return result;
        }

        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                result.setMax(arr[low]);
                result.setMin(arr[high]);
            } else {
                result.setMax(arr[high]);
                result.setMin(arr[low]);
            }
            return result;
        }

        int mid = (low + high) / 2;
        left = getMinMax(arr, low, mid);
        right = getMinMax(arr, mid + 1, high);

        if (left.getMin() < right.getMin())
            result.setMin(left.getMin());
        else
            result.setMin(right.getMin());

        if (left.getMax() > right.getMax())
            result.setMax(left.getMax());
        else
            result.setMax(right.getMax());

        return result;
    }

}
