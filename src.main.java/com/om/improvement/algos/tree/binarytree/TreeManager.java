/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED.
 *
 * R8  
 * 
 */

package com.om.improvement.algos.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.om.improvement.algos.Node;

public class TreeManager<T>
{
	/**
	 * Left-->Right-->Node
	 */
    public List<Node<T>> getPostOrderFromRec(Node<T> head)
    {
        List<Node<T>> postOrder = new ArrayList<Node<T>>();
        postOrderFromRec(postOrder, head);
        return postOrder;
    }
    
    private void postOrderFromRec(List<Node<T>> preOrder, Node<T> head)
    {
    	if (head != null)
        {
        	postOrderFromRec(preOrder, head.getLeft());
        	postOrderFromRec(preOrder, head.getRight());
        	preOrder.add(head);
        }
    }
    
	/**
	 * Node-->Left-->Right
	 */
    public List<Node<T>> getPreOrderFromRec(Node<T> head)
    {
        List<Node<T>> preOrder = new ArrayList<Node<T>>();
        preorderFromRec(preOrder, head);
        return preOrder;
    }
    
    private void preorderFromRec(List<Node<T>> preOrder, Node<T> head)
    {
    	if (head != null)
        {
        	preOrder.add(head);
        	preorderFromRec(preOrder, head.getLeft());
        	preorderFromRec(preOrder, head.getRight());
        }
    }
    
    /**
	 * Node-->Left-->Right
	 */
    public List<Node<T>> getInOrderFromRec(Node<T> head)
    {
        List<Node<T>> preOrder = new ArrayList<Node<T>>();
        inorderFromRec(preOrder, head);
        return preOrder;
    }
    
    private void inorderFromRec(List<Node<T>> preOrder, Node<T> head)
    {
    	if (head != null)
        {
    		inorderFromRec(preOrder, head.getLeft());
        	preOrder.add(head);
        	inorderFromRec(preOrder, head.getRight());
        }
    }
	
	/**
	 * Node-->Left-->Right
	 */
    public List<Node<T>> getPreOrder(Node<T> head)
    {
        List<Node<T>> preOrder = new ArrayList<Node<T>>();
        
        Stack<Node<T>> stack = new Stack<Node<T>>();
        if(head != null)
        {
        	stack.add(head);
        }
        while(!stack.isEmpty())
        {
        	Node<T> tempNode = stack.pop();
        	preOrder.add(tempNode);
        	if(tempNode.getRight() != null)
        	{
        		stack.add(tempNode.getRight());
        	}
        	if(tempNode.getLeft() != null)
        	{
        		stack.add(tempNode.getLeft());
        	}
        }
        
        return preOrder;
    }
    
    /**
	 * Left-->Node-->Right
	 */
    public List<Node<T>> getInOrderFormNonRecAlgo1(Node<T> head)
    {
        List<Node<T>> inOrder = new ArrayList<Node<T>>();
        
        Stack<Node<T>> stack = new Stack<Node<T>>();
        if(head != null)
        {
        	stack.add(head);
        }
        while(!stack.isEmpty())
        {
        	Node<T> tempNode = stack.pop();
        	if(tempNode.getLeft() != null)
        	{
        		if(!inOrder.contains(tempNode.getLeft()))
        		{
        			stack.add(tempNode);
        			stack.add(tempNode.getLeft());
        		}
        		else
        		{
        			inOrder.add(tempNode);
        			if(tempNode.getRight() != null)
                	{
                		stack.add(tempNode.getRight());
                	}
        		}
        	}
        	else if(tempNode.getLeft() == null)
        	{
        		inOrder.add(tempNode);
        		if(tempNode.getRight() != null)
            	{
            		stack.add(tempNode.getRight());
            	}
        	}
        }
        
        return inOrder;
    }
    
    /**
	 * Left-->Node-->Right
	 */
    public List<Node<T>> getInOrderFormNonRecAlgo2(Node<T> head)
    {
        List<Node<T>> inOrder = new ArrayList<Node<T>>();
        
        Stack<Node<T>> stack = new Stack<Node<T>>();
        while(true)
        {
        	while(head != null)
        	{
        		stack.add(head);
        		head = head.getLeft();
        	}
        	
        	if(stack.isEmpty())
        		break;
        	
        	head = stack.pop();
        	inOrder.add(head);
        	head = head.getRight();
        }
        
        return inOrder;
    }
    
    public List<Node<T>> zigZagTravers(Node<T> head)
    {
    	List<Node<T>> zigZagOrder = new ArrayList<Node<T>>();
        boolean leftToRight = true;
        Stack<Node<T>> currentStack = new Stack<Node<T>>();
        currentStack.push(head);
        Stack<Node<T>> nextLevelStack = new Stack<Node<T>>();
        while(!currentStack.isEmpty())
        {
        	Node<T> temp = currentStack.pop();
        	if(temp != null)
        	{
        		zigZagOrder.add(temp);
        		if(leftToRight)
        		{
        			if(temp.getLeft() != null)
        				nextLevelStack.push(temp.getLeft());
        			if(temp.getRight() != null)
        				nextLevelStack.push(temp.getRight());
        		}
        		else
        		{
        			if(temp.getRight() != null)
        				nextLevelStack.push(temp.getRight());
        			if(temp.getLeft() != null)
        				nextLevelStack.push(temp.getLeft());
        		}
        	}
        	
        	if(currentStack.isEmpty())
        	{
        		leftToRight = !leftToRight;
        		swap(currentStack, nextLevelStack);
        	}
        }
        
        return zigZagOrder;
    }
    
    private void swap(Stack<Node<T>> currentStack, Stack<Node<T>> nextLevelStack)
    {
    	for(int i = 0; i < nextLevelStack.size(); i++)
    	{
    		currentStack.push(nextLevelStack.get(i));
    	}
    	nextLevelStack.clear();
    }
}

/*
 * Copyright (c) Siemens AG 2016 ALL RIGHTS RESERVED
 * R8
 */
