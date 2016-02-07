package com.om.improvement.algos;

import java.util.HashSet;
import java.util.Set;

public class AlgoTools 
{
	public static boolean isAnyDuplicateEntryExit(int[] arr)
	{
		Set<Integer> elements = new HashSet<Integer>();
		for(int i : arr)
		{
			if(!elements.add(i))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static int getMissingNoInNaturalNumberArray(int[] numbers, int totalNumber)
	{
		int expectedSum = (totalNumber*(totalNumber + 1)) /2;
		int actualSum = 0;
		for(int number : numbers)
		{
			actualSum += number;
		}
		
		return expectedSum - actualSum; 
	}
	
	public static void printTopTwoElement(int[] arr)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int number: arr)
		{
			if(number > max1)
			{
				max2 = max1;
				max1 = number;
			}
			else if(number > max2)
			{
				max2 = number;
			}
		}
		
		System.out.println("Max1="+ max1);
		System.out.println("Max2="+ max2);
	}
	
	/**
	 * Complexity of this solution is O(n^2)
	 */
	public static void printPairWithSumEqual(int[] arr, int number)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if(i != j)
				{
					if((arr[i] + arr[j]) == number)
					{
						System.out.println(arr[i]+","+arr[j]);
					}
				}
			}
		}
	}
	
	public static int[] removeDuplicates(int[] numbersWithDuplicates) 
	{
		int[] arr = new int[numbersWithDuplicates.length];
		for(int i =0 ; i < numbersWithDuplicates.length; i++)
		{
			for(int j = 0 ; j <= i; j++)
			{
				if(arr[j] != numbersWithDuplicates[i])
				{
					if(i == j)
					{
						arr[j] = numbersWithDuplicates[i];
					}
				}
				else
				{
					break;
				}
			}
		}
		
		return arr;
	}
	
	public static void largestAndSmallest(int[] numbers)
	{
		int largest = Integer.MIN_VALUE; 
		int smallest = Integer.MAX_VALUE;
		for(int number : numbers)
		{
			if(number > largest)
			{
				largest = number;
			}
			if(smallest > number)
			{
				smallest = number;
			}
		}

		System.out.println("Largest="+ largest);
		System.out.println("Smallest="+ smallest);
	}
	
	public static int fact(int n)
	{
		if(n == 0 || n ==1)
			return 1;
		return n*fact(n-1);
	}
	
	public static int fib(int n)
	{
		if(n == 1 || n == 2 )
		{
			System.out.println();
			return 1;
		}
		return fib(n-1)+fib(n -2);
	}
	
	public static void main(String[] args) {
		System.out.println("Fib="+ fib(5));
	}
}
