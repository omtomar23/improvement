package com.om.improvement.algos.linklist;


public class SinglyLinkNode<T> 
{
	private T element;
	private SinglyLinkNode<T> right;
	
	public SinglyLinkNode(T element, SinglyLinkNode<T> right)
	{
		this.element = element;
		this.right = right;
	}
	
	public T getElement() 
	{
		return element;
	}
	
	public SinglyLinkNode<T> getRight() 
	{
		return right;
	}
	
	public void setRight(SinglyLinkNode<T> right) 
	{
		this.right = right;
	}
}
