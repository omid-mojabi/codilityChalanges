package com.lc.codility;

import com.lc.codility.lessons.utils.JumpFrogCounter;
import com.lc.codility.lessons.utils.MissingInteger;
import com.lc.codility.lessons.utils.OccurrencesInArray;
import com.lc.codility.utils.MergeSortImpl;
import com.lc.codility.utils.BubbleSortImpl;
import com.lc.codility.utils.QuickSortImpl;
import com.lc.codility.utils.ShiftArraysItemsImpl;

public class CodilityMainRunner {

    public static void main(String[] args) {

        MergeSortImpl mergeSortImpl = new MergeSortImpl();
        QuickSortImpl quickSortImpl = new QuickSortImpl();
		BubbleSortImpl bubbleSortImpl = new BubbleSortImpl();
		ShiftArraysItemsImpl shiftArrayImpl = new ShiftArraysItemsImpl();
        OccurrencesInArray occurrencesInArrayImpl = new OccurrencesInArray();

        int[] intArr = new int[]{49, 23, 59, 23, 49, 32};

        int[] sortedArray1 = mergeSortImpl.mergeSort(intArr);
        for (int e : sortedArray1) {
            System.out.print(e + " ");
        }
        System.out.println();
        quickSortImpl.quickSort(intArr);
        for (int e : intArr) {
            System.out.print(e + " ");
        }
        System.out.println();
        bubbleSortImpl.bubble(intArr);
                for (int e : intArr) {
            System.out.print(e + " ");
        }

        for (int e : intArr) {
        	System.out.print(e + " ");
        }
        System.out.println();
        int[] shiftedToLeft = shiftArrayImpl.shiftLeft(intArr);
        for (int e : shiftedToLeft) {
        	System.out.print(e + " ");
        }
        System.out.println();

        int[] intArrBeforeShift=new int[]{1, 2, 3, 4, 5, 6};
        for (int e : intArrBeforeShift) {
        	System.out.print(e + " ");
        }
        System.out.println();
        //shiftRight
        shiftArrayImpl.rotate(intArrBeforeShift,2);
        //shiftLeft
        shiftArrayImpl.rotate(intArrBeforeShift,1);
        //reverse
        shiftArrayImpl.reverse(intArrBeforeShift);
        for (int e : intArrBeforeShift) {
        	System.out.print(e + " ");
        }
        System.out.println();

        int[] intArrOccurrences=new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        //int[] intArrOccurrences=new int[]{9, 3, 9, 3, 9, 7, 9};
        for (int e : intArrOccurrences) {
        	System.out.print(e + " ");
        }
        System.out.println();
        System.out.print(occurrencesInArrayImpl.getOddOccurrence(intArrOccurrences,
        		intArrOccurrences.length));

        JumpFrogCounter vJumpFrogCounterImpl = new JumpFrogCounter();
        System.out.println(vJumpFrogCounterImpl.jumps(10, 85, 30));

        MissingInteger missingIntegerImpl = new MissingInteger();
        int[] intArrMissing=new int[]{2};//int[]{6664,6665,6666,6668};
        System.out.println(missingIntegerImpl.findMissingDistinctIntegerLowPerformance(intArrMissing));
        System.out.println(missingIntegerImpl.findMissingDistinctInteger(intArrMissing));

    }
}
