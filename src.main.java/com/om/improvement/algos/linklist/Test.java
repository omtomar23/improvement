/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.linklist;

public class Test
{
    public static void main(String[] args)
    {
//        LinkList<Integer> list = new LinkList<Integer>();
//        list.add(1);
//        list.add(2);
//        
//        System.out.println("Size=" + list.size());
//        
//        boolean removed = list.remove(1);
//        System.out.println("removed=" + removed + " ,Size=" + list.size());
//        
//        removed = list.remove(2);
//        System.out.println("removed=" + removed + " ,Size=" + list.size());
    	
    	SingleLinkList<Integer> list = new SingleLinkList<Integer>();
    	list.add(1);
    	list.add(3);
    	list.add(0,5);
    	list.add(6);
    	
    	list.remove(2);
    	System.out.println("Size="+ list.size());
    	System.out.println("Last Elment="+ list.getLast());
    	list.traverse();
    	
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
