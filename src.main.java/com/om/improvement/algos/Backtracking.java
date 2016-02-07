package com.om.improvement.algos;

import com.om.improvement.GeneralTools;

public class Backtracking 
{
	public static final int BITS = 3;
	public int[] a = new int[BITS];
	
	public void binary(int n)
	{
		if(n < 1)
			GeneralTools.printArray(a);
		else
		{
			a[n-1] = 0;
			binary(n-1);
			a[n-1] = 1;
			binary(n-1);
		}
	}
	
	public void kString(int n , int k)
	{
		if(n < 1)
			GeneralTools.printArray(a);
		else
		{
			for(int i = 0; i < k; i++)
			{
				a[n-1] = i;
				kString(n-1, k);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Backtracking backtracking = new Backtracking();
		backtracking.kString(3,3);
	}
}
