package com.om.improvement.algos.linklist;


public interface MyList<T>
{
	public void add(T element);
	public void addFirst(T element);
	public void addLast(T element);
	public void add(int index, T element);
	
	public T getLast();
	public T getFirst();
	
	public void remove(int index);
	public void removeLast();
	public void remove();
	public void removeFirst();

	public int size();
}
