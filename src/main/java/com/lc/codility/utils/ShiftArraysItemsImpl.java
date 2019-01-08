package com.lc.codility.utils;

public class ShiftArraysItemsImpl {
	
	//Algorithm Complexity Analysis: O(n)	
	public int[] shiftLeft(int[] numbers) {
	    for(int i = 0, start = 0; i < numbers.length; i++)
	    {
	        if(i == 0)
	            start = numbers[i];
	        if(i == (numbers.length -1))
	        {
	            numbers[i] = start;
	            break;
	        }    
	        numbers[i] = numbers[i + 1];
	    }
	    return numbers;
	}
	
	//Algorithm Complexity Analysis: O(n * k)
	public void rotate(int[] numbers,int k) {
	        int temp, previous;
	        for (int i = 0; i < k; i++) {
	            previous = numbers[numbers.length - 1];
	            for (int j = 0; j < numbers.length; j++) {
	                temp = numbers[j];
	                numbers[j] = previous;
	                previous = temp;
	            }
	        }
	}

	//Algorithm Complexity Analysis: O(n)
	public void reverse(int[] numbers){
		for(int i = 0; i < numbers.length / 2; i++)
		{
		    int temp = numbers[i];
		    numbers[i] = numbers[numbers.length - i - 1];
		    numbers[numbers.length - i - 1] = temp;
		}
	}

}
