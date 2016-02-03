/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.sorting;

import com.om.improvement.TimeMonitor;

public class SortingRunner
{
    private ISort sorting;
    private TimeMonitor monitor;
    
    public SortingRunner(TimeMonitor monitor, ISort sorting)
    {
        this.monitor = monitor;
        this.sorting = sorting;
    }
    
    public int[] sort(int[] arr)
    {
        monitor.resetTimer();
        monitor.startTimer();
        int[] sort = sorting.sort(arr);
        monitor.stopTimer();
        
        return sort;
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
