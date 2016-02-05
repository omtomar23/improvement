package com.om.improvement.algos;

import java.util.HashSet;
import java.util.Set;

public class AlgoTools 
{
	public boolean isAnyDuplicateEntryExit(int[] arr)
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
}
