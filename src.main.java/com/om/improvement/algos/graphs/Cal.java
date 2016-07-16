package com.om.improvement.algos.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cal
{
	public static long calSum(String str)
	{
		long sum = 0;
		if (str == null || str.length() == 0)
			return 0;
		long[] arr = new long[26];
		arr[0] = 0;
		arr[1] = 1;
		System.out.print(arr[0]+","+ arr[1]+",");
		for(int i = 2; i < arr.length; i++)
		{
			arr[i]  = arr[i -1] + arr[i -2];
			System.out.print(arr[i]+",");
		}
		System.out.println("");
		for(int i = 0; i < str.length(); i++)
		{
			System.out.println("char index="+ (str.charAt(i))+ ", num="+ arr[str.charAt(i) - 65]);
			sum = sum + arr[str.charAt(i) -65];
		}

		
		return sum;
	}
	public static void fib(int num)
	{
		int[] arr = new int[num+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++)
		{
			arr[i]  = arr[i -1] + arr[i -2];
			System.out.println(arr[i] + ",");
		}
	}
	
	public static void bit()
	{
		int num1 = -1;
		int num2 = 1;
		int num3 = num1 & num2;
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		System.out.println(num3+ "="+Integer.toBinaryString(num3));
	}
	
	public static String[] filterWithAnagramStr(String[] input)
	{
		List<String> anagramList = new ArrayList<String>();
		for(int i = 0; i < input.length; i++)
		{
			for(int j = 0; j < input.length; j++)
			{
				if(i != j)
				{
					if(isAnagramUsingMap(input[i], input[j]))
					{
						anagramList.add(input[i]);
					}
				}
			}
			
		}
		String[] al = new String[anagramList.size()];
		anagramList.toArray(al);
		return al;
	}
	public static boolean isAnagramUsingMap(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i = 0; i< str1.length();i++)
		{
			set.add(str1.charAt(i));
		}
		for(int i = 0; i< str2.length();i++)
		{
			if(!set.contains(str2.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAnagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		for(int i = 0; i< str1.length();i++)
		{
			if(str2.indexOf(str1.charAt(i)) == -1)
			{
				return false;
			}
		}
		return true;
	}
	
	public static String removeConsecutiveChars(String str)
	{
		if(str.length() <= 1)
			return str;
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i = 1; i < str.length(); i++)
		{
			if(str.charAt(i) != str.charAt(i -1))
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static boolean isPalandrom(String str)
	{
		for(int i = 0, j = str.length() -1; i < str.length(); i++ , j--)
		{
			if( i < j)
			{
				if(str.charAt(i) != str.charAt(j))
				{
					return false;
				}
			}
			if( i == j)
			{
				return true;
			}
		}
		
		return true;
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}
	
	private static void permutation(String prefix, String str) {
		System.out.println("Prefix="+ prefix + " ,str="+ str);
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else 
	    {
	        for (int i = 0; i < n; i++)
	        {
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}

	public static void main(String[] args) {
		//System.out.println(calSum("SDK"));
		//bit();
		//System.out.println(isPalandrom("absaa"));
		//System.out.println(removeConsecutiveChars("aabaaa abbbd"));
//		for( String str : filterWithAnagramStr(new String[]{"abcd", "abc", "cba"}))
//		{
//			System.out.println(str);
//		}
		
		permutation("ab");
		System.out.println("b".substring(1, 1));
	}
}
