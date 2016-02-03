/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement;

public class ThreadUtils
{
    private ThreadUtils()
    {
        
    }
    
    public static void asleep(long timeInMiilis)
    {
        try
        {
            Thread.sleep(timeInMiilis);
        }
        catch (InterruptedException e)
        {
            System.err.println(e);
        }
    }
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
