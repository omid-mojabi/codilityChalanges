package com.lc.codility.lessons.oddOccurrencesInArray.solutions;

import com.lc.codility.lessons.utils.OccurrencesInArray;

public class OddOccurrencesInArraySolution {

    public int solution(int[] A) {
        OccurrencesInArray occurrencesInArray = new OccurrencesInArray();
        return occurrencesInArray.getOddOccurrence(A,A.length);
    }
}
