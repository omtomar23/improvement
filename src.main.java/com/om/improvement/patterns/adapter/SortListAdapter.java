/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter
{
    private NumberSorter numberSorter;
    
    public SortListAdapter(NumberSorter numberSorter)
    {
        this.numberSorter = numberSorter;
        
    }
    
    @Override
    public int[] sort(int[] numbers)
    {
        List<Integer> elements = new ArrayList<Integer>();
        for (int number : numbers)
        {
            elements.add(number);
        }
        List<Integer> sortList = numberSorter.sort(elements);
        int[] ret = new int[sortList.size()];
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = sortList.get(i).intValue();
        }
        return ret;
        
    }
    
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
