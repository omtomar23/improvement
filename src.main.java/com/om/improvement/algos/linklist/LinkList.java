/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.linklist;

public class LinkList<T>
{
    private Node<T> node;
    private int count;
    
    public LinkList()
    {
        
    }
    
    public void add(T element)
    {
        if (node == null)
        {
            node = new Node<T>(null, element, null);
            count++;
        }
        else
        {
            Node<T> newNode = new Node<T>(node, element, null);
            node.setNext(newNode);
            count++;
        }
    }
    
    public boolean remove(T element)
    {
        boolean isRemoved = false;
        if (node != null)
        {
            Node<T> localNode = node;
            while (localNode != null)
            {
                System.out.println(localNode.getElement());
                if (localNode.getElement().equals(element))
                {
                    Node<T> next = localNode.getNext();
                    if (next != null)
                    {
                        node = next;
                        next.setFirst(null);
                    }
                    else
                    {
                        node = null;
                    }
                    isRemoved = true;
                    count--;
                    break;
                }
                else
                {
                    localNode = localNode.getNext();
                }
            }
            
        }
        return isRemoved;
    }
    
    public int size()
    {
        return count;
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
