/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement;

public class TimeMonitor
{
    private long startTimeInMillis;
    private long endTimeInMillis;
    
    public void startTimer()
    {
        startTimeInMillis = System.currentTimeMillis();
    }
    
    public void stopTimer()
    {
        endTimeInMillis = System.currentTimeMillis();
    }
    
    public long getTakenTimeInMillis()
    {
        long timeTaken = endTimeInMillis - startTimeInMillis;
        return timeTaken;
    }
    
    public long getTakenTimeInSec()
    {
        long timeTaken = (endTimeInMillis - startTimeInMillis) / 1000;
        return timeTaken;
    }
    
    public void resetTimer()
    {
        startTimeInMillis = 0;
        endTimeInMillis = 0;
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
