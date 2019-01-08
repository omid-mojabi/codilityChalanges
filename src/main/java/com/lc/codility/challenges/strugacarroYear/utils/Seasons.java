package com.lc.codility.challenges.strugacarroYear.utils;

public class Seasons {
    private int[] winterRange;
    private int[] summerRange;
    private int[] springRange;
    private int[] autumnRange;

    Seasons(int[] yearRange) {
        int pivot = yearRange.length / 4;
        winterRange = calculateWinterRange(yearRange, pivot);
        autumnRange = calculateAutumnRange(yearRange, pivot);
        springRange = calculateSpringRange(yearRange, pivot);
        summerRange = calculateSummerRange(yearRange, pivot);
    }

    private int[] calculateWinterRange(int[] yearRange, int pivot) {

        if (yearRange.length == 4) {
            return new int[yearRange[0]];
        } else {
            int[] result = new int[pivot];
            for (int i = 0; i < pivot; i++)
                result[i] = yearRange[i];
            return result;
        }
    }

    private int[] calculateAutumnRange(int[] yearRange, int pivot) {

        if (yearRange.length == 4) {
            return new int[yearRange[yearRange.length - 1]];
        } else {
            int[] result = new int[pivot];
            for (int i = yearRange.length - 1 - pivot; i > 0; i--)
                result[i] = yearRange[i];
            return result;
        }
    }

    private int[] calculateSpringRange(int[] yearRange, int pivot) {

        if (yearRange.length == 4) {
            return new int[yearRange[1]];
        } else {
            int[] result = new int[pivot];
            for (int i = pivot; i < yearRange.length - 1 - pivot; i++)
                result[i] = yearRange[i];
            return result;
        }
    }

    private int[] calculateSummerRange(int[] yearRange, int pivot) {

        if (yearRange.length == 4) {
            return new int[yearRange[2]];
        } else {
            int[] result = new int[pivot];
            for (int i = (pivot * 2) - 1; i < yearRange.length - 1; i++)
                result[i] = yearRange[i];
            return result;
        }
    }

    public int[] getWinterRange() {
        return winterRange;
    }

    public int[] getSummerRange() {
        return summerRange;
    }

    public int[] getSpringRange() {
        return springRange;
    }

    public int[] getAutumnRange() {
        return autumnRange;
    }
}
