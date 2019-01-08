package com.lc.codility.lessons.utils;

import com.lc.codility.utils.MergeSortImpl;

public class MissingInteger {

    public int findSmallestMissingInteger(int[] intStream) {
        if (intStream == null || intStream.length == 0)
            return 1;
        boolean[] lookupFlags = new boolean[intStream.length + 2];

        for (int i = 0; i < intStream.length; i++)
            if (intStream[i] < lookupFlags.length && intStream[i] > 0)
                lookupFlags[intStream[i]] = true;

        for (int i = 1; i < lookupFlags.length; i++)
            if (!lookupFlags[i])
                return i;

        return 1;
    }

    //This similar code developed at work
    //In this implementation is needed to the missing parameter
    public int findMissingDistinctIntegerLowPerformance(int[] intStream) {

        MergeSortImpl mergeSortImpl = new MergeSortImpl();
        int[] intStreamSorted = mergeSortImpl.mergeSort(intStream);

        if (intStreamSorted == null || intStreamSorted.length < 1)
            return 1;
        else if (intStreamSorted.length < 2)
            return intStreamSorted[0] + 1;

        int prefixPart = intStreamSorted[intStreamSorted.length - 1] / 10;

        boolean[] lookupFlags = new boolean[intStreamSorted.length + 2];
        for (int i = 0; i < intStreamSorted.length; i++)
            if (intStreamSorted[i] > 0 && intStreamSorted[i] < prefixPart * 10 + lookupFlags.length)
                lookupFlags[intStreamSorted[i] - prefixPart * 10] = true;

        for (int i = 1; i < lookupFlags.length; i++)
            if (!lookupFlags[i])
                return (prefixPart * 10) + i;

        return 1;
    }

    public int findMissingDistinctInteger(int[] A) {

        long X = A.length + 1;
        long intStreamExpectedSum = (X * (X + 1)) / 2;
        long intStreamActualSum = 0;

        for (int anIntStream : A)
            intStreamActualSum = intStreamActualSum + anIntStream;

        return (int) (intStreamExpectedSum - intStreamActualSum);

    }

}
