package com.lc.codility.challenges.strugacarroYear;

import com.lc.codility.challenges.strugacarroYear.solutions.StrugacarroYearSolution;

public class StrugacarroYearMain {

    public static void main(String[] args) {
        StrugacarroYearSolution strugacarro = new StrugacarroYearSolution();

        //int[] testArray = new int[]{1, 3, 6, 4, 1, 2};
        //int[] testArray = new int[]{1, 2, 3};
        //int[] testArray = new int[]{7, 7, 0};
        //int[] testArray = new int[] {-1, -3};
        //int[] testArray = new int[]{-1};
        //int[] testArray = new int[] {1};
        //int[] testArray = new int[] {};
        //int[] testArray = new int[] {6};
        //int[] testArray = new int[] {2};
        //int[] testArray = new int[]{32765, 3, 6, 4, 1, 2};
        //int[] testArray = new int[]{32764, 35000, 98000, 1000000, 1, 2};
        //int[] testArray = new int[]{32764, 35000, 98000, 1000000001, 1, 2};
        //int[] testArray = new int[]{32764, 35000, 98000, -100000000, 1, 2};
        //int[] testArray = new int[]{32764, 98000, 97999, -100000000, 1, 2};
        int[] testArray = new int[]{-3, -14, -5, 7, 8, 42, 8, 3};//{1, 2, 233};
        //int[] testArray = new int[]{2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};
        System.out.println(strugacarro.solution(testArray));
    }
}
