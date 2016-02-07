package com.om.improvement.algos.linklist;

import java.util.NoSuchElementException;


public class SingleLinkList<T> implements MyList<T>
{
	private SingleLinkNode<T> head;
	private int count;
	public SingleLinkList()
	{
		
	}
	
	public void remove(int index)
	{
		if(!(index >= 0 && index <= count))
			throw new IllegalArgumentException("Index in more than count");
		
		SingleLinkNode<T> temp = head;
		if(index == 0)
		{
			head = temp.getRight();
			count--;
		}
		else
		{
			SingleLinkNode<T> previous = temp;
			int nodeIndex = 0;
			while((nodeIndex != index))
			{
				previous = temp;
				temp = temp.getRight();
				nodeIndex++;
			}
			
			previous.setRight(temp.getRight());
			count--;
		}
		
	}
	
	public void removeLast()
	{
		SingleLinkNode<T> temp = head;
		if (temp == null)
			throw new NoSuchElementException();

		if(count == 1)
		{
			head = temp.getRight();
			count--;
		}
		else
		{
			SingleLinkNode<T> previuos = temp;
			while(temp.getRight() != null)
			{
				previuos = temp;
				temp = temp.getRight();
			}

			previuos.setRight(null);
			count--;
		}
	}
	
	public void remove()
	{
		removeFirst();
	}
	
	public void removeFirst()
	{
		SingleLinkNode<T> temp = head;
        if (temp == null)
            throw new NoSuchElementException();
        head = temp.getRight();
        count--;
	}
	
	public void add(int index, T element)
	{
		if(!(index >= 0 && index <= count))
			throw new IllegalArgumentException("Index in more than count");

		SingleLinkNode<T> temp = head;
		if(temp == null || index == 0)
		{
			head = new SingleLinkNode<T>(element, head);
			count++;
		}
		else
		{
			int position = 0;
			SingleLinkNode<T> previousNode = temp;
			while(position != index)
			{
				previousNode = temp;
				temp = temp.getRight();
				position++;
			}

			previousNode.setRight(new SingleLinkNode<T>(element, temp));
			count++;
		}
	}
	
	public T getLast()
	{
		if (head == null)
			throw new NoSuchElementException();
		SingleLinkNode<T> temp = head;
		SingleLinkNode<T> lastNode = temp;
		while(temp != null)
		{
			lastNode = temp;
			temp = temp.getRight();
		}
		return lastNode.getElement();
	}
	
	public T getFirst()
	{
		if (head == null)
			throw new NoSuchElementException();
		return head.getElement();
	}
	
	public void addFirst(T element)
	{
		if(head == null)
		{
			head = new SingleLinkNode<T>(element, null);
			count++;
		}
		else
		{
			head = new SingleLinkNode<T>(element, head);
			count++;
		}
	}
	
	public void addLast(T element)
	{
		add(element);
	}
	
	public void add(T element)
	{
		if(head == null)
		{
			head = new SingleLinkNode<T>(element, null);
			count++;
		}
		else
		{
			SingleLinkNode<T> temp = head;
			while(temp != null)
			{
				if(temp.getRight() != null)
				{
					//move to next node
					temp = temp.getRight();
				}
				else
				{
					temp.setRight(new SingleLinkNode<T>(element, null));
					break;
				}
				
			}
			count++;
		}
	}
	
	public void traverse()
	{
		SingleLinkNode<T> temp = head;
		while(temp != null)
		{
			System.out.println(temp.getElement());
			temp = temp.getRight();
		}
	}

	public int size() 
	{
		return count;
	}
	
	
}
