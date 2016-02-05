/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos;

public class Node<T>
{
    private Node<T> first;
    private final T element;
    private Node<T> next;
    
    public Node(Node<T> first, T element, Node<T> next)
    {
        this.first = first;
        this.element = element;
        this.next = next;
    }
    
    public Node<T> getLeft()
    {
        return first;
    }
    
    public T getElement()
    {
        return element;
    }
    
    public Node<T> getRight()
    {
        return next;
    }
    
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    
    public void setFirst(Node<T> first)
    {
        this.first = first;
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
