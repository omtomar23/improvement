package com.om.improvement.algos;

import java.util.ArrayList;
import java.util.List;

public class StringTools 
{
	public static String reverse(String str)
	{
		if(str == null || str.trim().isEmpty())
			return str;
		StringBuilder rev = new StringBuilder();
		for(int i = str.length()-1; i >=0; i--)
		{
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}
	
	/**
	 * Input--> abbbaaac, Output--> abac
	 */
	public static String removeConsecutiveCharaters(String str)
	{
		if(str == null || str.trim().isEmpty())
			return str;
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); i++)
		{
			if(i != 0)
			{
				if(str.charAt(i-1) != str.charAt(i) )
					builder.append(str.charAt(i));
			}
			else
			{
				builder.append(str.charAt(i));
			}
		}
		return builder.toString();
	}
	
	/**
	 * Input--> aba, Output--> True
	 * Input--> abc, Output--> False
	 */
	public static boolean isPalindrome(String str)
	{
		if(str == null || str.trim().isEmpty())
			return false;
		for(int i = 0, j = str.length() -1; i < str.length(); i++, j--)
		{
			if(i < j)
			{
				if(str.charAt(i) != str.charAt(j))
				{
					return false;
				}
			}
			else if(i == j)
			{
				return true;
			}
		}
		return true;
	}
	
	public static String findLongestPalindrome(String str)
	{
		if(str == null || str.trim().isEmpty())
			return str;
		//TODO
		return "";
	}
	
	public static List<String> permutation(String str)
	{
		List<String> allPermutations = new ArrayList<String>();
		if(str == null || str.trim().isEmpty())
			return allPermutations;
		
		//TODO
		
		return allPermutations;
	}
	
	public static char firstNonRepeatedCharacter(String str)
	{
		char ch = ' ';
		if(str == null || str.trim().isEmpty())
			return ch;
		
		char[] chars = new char[str.length()];
		for(int i = 0; i < chars.length; i++)
		{
			chars[i] = ' ';
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(chars[j] != str.charAt(i))
				{
					if(chars[j] == ' ')
						chars[j] = str.charAt(i);
				}
				else
				{
					chars[j] = ' ';
				}
			}
		}
		
		for(int i = 0; i < chars.length; i++)
		{
			if(chars[i] != '1')
			{
				ch = chars[i];
				break;
			}
		}
		
		return ch;
	}
	
	public static void printOccurences(String str)
	{
		int[] elements = new int[26];
		char[] smallAlphabets = new char[]{'a', 'b', 'c','d', 'e', 'f', 'g', 'h',
				'i', 'j', 'k','l', 'm', 'n', 'o', 'p',
				'q', 'r', 's','t', 'u', 'v', 'w', 'x',
				'y', 'z'};
		for(int i = 0; i < str.length(); i++)
		{
			elements[str.charAt(i) - 97]++;
		}
		for (int i = 0 ; i < elements.length; i++) 
		{
			System.out.println(smallAlphabets[i]+"="+elements[i] + " ,");
		}
	}
	
	public static boolean isAnagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;
		boolean charExit = false;
		for(int i = 0; i< str1.length();i++)
		{
			for(int j = 0; j< str2.length();j++)
			{
				if(str1.charAt(i)== str2.charAt(j))
				{
					charExit = true;
				}
			}
			
			if(!charExit)
			{
				return false;
			}
			else
			{
				charExit = false;
			}
		}
		return true;
	}
	
	public static void permuteString(String beginningString, String endingString)
	{
	    if (endingString.length() <= 1)
	    {
	      System.out.println(beginningString + endingString);
	    }
	    else
	    {
	      for (int i = 0; i < endingString.length(); i++) 
	      {
	    	  String newString = endingString.substring(0, i) + endingString.substring(i + 1);
	    	  permuteString(beginningString + endingString.charAt(i), newString);
	      }
	    }
	  }
	
	public void shortestPalindrome(String str)
	{
		//TODO
	}
	
	public void longestPalindrome(String str)
	{
		//TODO
	}
	
	public static void main(String[] args)
	{
		permuteString("", "xx");
	}
}
