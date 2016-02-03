/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.threadpool;

import java.util.concurrent.CountDownLatch;

import com.om.improvement.ThreadUtils;

public class ThreadPoolTest
{
    private static CountDownLatch countDownLatch;
    
    static class Task implements Runnable
    {
        @Override
        public void run()
        {
            ThreadUtils.asleep(100);
            countDownLatch.countDown();
        }
        
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        countDownLatch = new CountDownLatch(10000);
        long startTime = System.currentTimeMillis();
        GenExcecutor excecutor = new GenExcecutor(100, new ThreadFactory());
        for (int i = 0; i < 10000; i++)
        {
            excecutor.submit(new Task());
        }
        countDownLatch.await();
        excecutor.shutdown();
        System.out.println("Time taken in sec=" + (System.currentTimeMillis() - startTime) / 1000);
    }
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
