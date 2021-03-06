package com.lc.codility.utils;

public class CountingSortImpl {
	
	public int[] countingSort(int[] numbers) {
	    int max = numbers[0];
	    for (int i = 1; i < numbers.length; i++) 
	        if (numbers[i] > max)
	            max = numbers[i];
	    
	    int[] sortedNumbers = new int[max+1];
	    for (int i = 0; i < numbers.length; i++) 
	        sortedNumbers[numbers[i]]++;
	    
	    int insertPosition = 0;
	    for (int i = 0; i <= max; i++) 
	            for (int j = 0; j < sortedNumbers[i]; j++) 
	                    numbers[insertPosition] = i;
	                    insertPosition++;
	    return numbers;
	}

}
