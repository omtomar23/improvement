/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.threadpool;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadFactory
{
    private static final AtomicInteger poolNumber = new AtomicInteger(1);
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;
    
    public ThreadFactory()
    {
        namePrefix = "pool-" +
            poolNumber.getAndIncrement() +
            "-thread-";
    }
    
    Thread newThread(Runnable r)
    {
        return new Thread(r, namePrefix + threadNumber.getAndIncrement());
    }
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
