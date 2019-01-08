package com.lc.codility.lessons.missingIntegers.solutions;

import com.lc.codility.lessons.utils.MissingInteger;

public class SmallestMissingElementSolution {

    public int solution(int[] A) {
        MissingInteger missingInteger = new MissingInteger();
        return missingInteger.findSmallestMissingInteger(A);
    }
}
