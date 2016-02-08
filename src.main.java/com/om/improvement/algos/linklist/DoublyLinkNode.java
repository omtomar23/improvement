package com.om.improvement.algos.linklist;

public class DoublyLinkNode<T>
{
	private T element;
	private DoublyLinkNode<T> left;
	private DoublyLinkNode<T> right;
	
	public DoublyLinkNode(T element, DoublyLinkNode<T> left, DoublyLinkNode<T> right)
	{
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	public T getElement() 
	{
		return element;
	}
	
	public DoublyLinkNode<T> getLeft()
	{
		return left;
	}
	
	public void setLeft(DoublyLinkNode<T> left)
	{
		this.left = left;
	}
	
	public DoublyLinkNode<T> getRight() 
	{
		return right;
	}
	
	public void setRight(DoublyLinkNode<T> right) 
	{
		this.right = right;
	}

}
