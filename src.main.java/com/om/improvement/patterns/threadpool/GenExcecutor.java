/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.patterns.threadpool;

import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GenExcecutor
{
    private BlockingQueue<Runnable> blockingQueue;
    private final HashSet<Worker> workers;
    private ThreadFactory threadFactory;
    private int poolSize;
    private volatile boolean shutDown = false;
    
    public GenExcecutor(int poolSize, ThreadFactory threadFactory)
    {
        this.poolSize = poolSize;
        this.blockingQueue = new LinkedBlockingQueue<Runnable>();
        this.workers = new HashSet<Worker>();
        this.threadFactory = threadFactory;
    }
    
    public void shutdown()
    {
        shutDown = true;
        for (Worker worker : workers)
        {
            worker.thread.interrupt();
        }
    }
    
    private final class Worker implements Runnable
    {
        final Thread thread;
        
        Worker()
        {
            
            this.thread = threadFactory.newThread(this);
        }
        
        @Override
        public void run()
        {
            while (!shutDown)
            {
                try
                {
                    Runnable take = blockingQueue.take();
                    take.run();
                }
                catch (InterruptedException e)
                {
                    System.err.println(e);
                }
            }
        }
        
    }
    
    public void submit(Runnable runnable)
    {
        blockingQueue.add(runnable);
        if (blockingQueue.size() > poolSize)
        {
            if (workers.size() < poolSize)
            {
                Worker worker = new Worker();
                workers.add(worker);
                worker.thread.start();
            }
        }
    }
}

/*
 * Copyright (c) Siemens AG 2015 ALL RIGHTS RESERVED
 * R8
 */
