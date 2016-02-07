package com.om.improvement.algos.linklist;


public class SingleLinkNode<T> 
{
	private T element;
	private SingleLinkNode<T> right;
	
	public SingleLinkNode(T element, SingleLinkNode<T> right)
	{
		this.element = element;
		this.right = right;
	}
	
	public T getElement() 
	{
		return element;
	}
	
	public SingleLinkNode<T> getRight() 
	{
		return right;
	}
	
	public void setRight(SingleLinkNode<T> right) 
	{
		this.right = right;
	}
}
