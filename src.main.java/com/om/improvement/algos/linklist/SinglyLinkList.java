package com.om.improvement.algos.linklist;

import java.util.NoSuchElementException;


public class SinglyLinkList<T> implements MyList<T>
{
	private SinglyLinkNode<T> head;
	private int count;
	public SinglyLinkList()
	{
		
	}
	
	public void remove(int index)
	{
		if(!(index >= 0 && index <= count))
			throw new IllegalArgumentException("Index in more than count");
		
		SinglyLinkNode<T> temp = head;
		if(index == 0)
		{
			head = temp.getRight();
			count--;
		}
		else
		{
			SinglyLinkNode<T> previous = temp;
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
		SinglyLinkNode<T> temp = head;
		if (temp == null)
			throw new NoSuchElementException();

		if(count == 1)
		{
			head = temp.getRight();
			count--;
		}
		else
		{
			SinglyLinkNode<T> previuos = temp;
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
		SinglyLinkNode<T> temp = head;
        if (temp == null)
            throw new NoSuchElementException();
        head = temp.getRight();
        count--;
	}
	
	public void add(int index, T element)
	{
		if(!(index >= 0 && index <= count))
			throw new IllegalArgumentException("Index in more than count");

		SinglyLinkNode<T> temp = head;
		if(temp == null || index == 0)
		{
			head = new SinglyLinkNode<T>(element, head);
			count++;
		}
		else
		{
			int position = 0;
			SinglyLinkNode<T> previousNode = temp;
			while(position != index)
			{
				previousNode = temp;
				temp = temp.getRight();
				position++;
			}

			previousNode.setRight(new SinglyLinkNode<T>(element, temp));
			count++;
		}
	}
	
	public T getLast()
	{
		if (head == null)
			throw new NoSuchElementException();
		SinglyLinkNode<T> temp = head;
		SinglyLinkNode<T> lastNode = temp;
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
			head = new SinglyLinkNode<T>(element, null);
			count++;
		}
		else
		{
			head = new SinglyLinkNode<T>(element, head);
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
			head = new SinglyLinkNode<T>(element, null);
			count++;
		}
		else
		{
			SinglyLinkNode<T> temp = head;
			while(temp.getRight() != null)
			{
				temp = temp.getRight();
			}
			temp.setRight(new SinglyLinkNode<T>(element, null));
			count++;
		}
	}
	
	public void traverse()
	{
		SinglyLinkNode<T> temp = head;
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
	
	public void reverse()
	{
		SinglyLinkNode<T> current = head;
		SinglyLinkNode<T> previous = null;
		while(current != null)
		{
			SinglyLinkNode<T> next = current.getRight();
			current.setRight(previous);
			
			previous = current;
			current = next;
		}
		
		head = previous;
	}
	
	
}
