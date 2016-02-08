package com.om.improvement.algos.linklist;

public class DoublyLinkList<T> implements MyList<T>
{
	private DoublyLinkNode<T> head;
	private int count;
	
	@Override
	public void add(T element) 
	{
		if(head == null)
		{
			head = new DoublyLinkNode<T>(element, null, null);
			count++;
		}
		else
		{
			DoublyLinkNode<T> temp = head;
			while(temp.getRight() != null)
			{
				temp = temp.getRight();
			}
			
			temp.setRight(new DoublyLinkNode<T>(element, temp, null));
			count++;
		}
	}

	@Override
	public void addFirst(T element)
	{
		if(head == null)
		{
			head = new DoublyLinkNode<T>(element, null, null);
			count++;
		}
		else
		{
			DoublyLinkNode<T> temp = head;
			head = new DoublyLinkNode<T>(element, null, temp);
			temp.setLeft(head);
			count++;
		}
	}

	@Override
	public void addLast(T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() 
	{
		return count;
	}

	public void traverse()
	{
		DoublyLinkNode<T> temp = head;
		while(temp != null)
		{
			System.out.println(temp.getElement());
			temp = temp.getRight();
		}
	}
}
