package com.lc.codility.lessons.permMissingElem.solutions;

import com.lc.codility.lessons.utils.MissingInteger;

public class PermMissingElemSolution {

    public int solution(int[] A){
        MissingInteger missingInteger = new MissingInteger();
        return missingInteger.findMissingDistinctInteger(A);
    }
}
