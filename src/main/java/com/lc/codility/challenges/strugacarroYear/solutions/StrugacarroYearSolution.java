package com.lc.codility.challenges.strugacarroYear.solutions;

public class StrugacarroYearSolution {

    /**
     * Algorithm Complexity Analysis: O(N^2)
     */
    public String solution(int[] T) {

        final String[] seasonNames = new String[] {"WINTER", "SPRING", "SUMMER", "AUTUMN"};

        int days = T.length;
        int season = days / 4;

        int amplitude = 0;
        int maxDiff = 0;

        int n = 0;

        for (int i=0 ; i < 4; i ++) {
            int seasonMax = Integer.MIN_VALUE;
            int seasonMin = Integer.MAX_VALUE;

            for (int j=0; j < season; j++) {
                if (T[n] > seasonMax)
                    seasonMax = T[n];
                if (T[n] < seasonMin)
                    seasonMin = T[n];

                n++;
            }

            int difference = Math.abs(seasonMax - seasonMin);
            if (difference > maxDiff) {
                maxDiff = difference;
                amplitude = i;
            }
        }

        return seasonNames[amplitude];

    }

}
