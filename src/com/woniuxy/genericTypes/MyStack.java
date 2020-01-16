package com.woniuxy.genericTypes;



public class MyStack<T> {
	private int size = 10;
	private Object[] array;
	private int index;
	
	/**
	 * 
	 */
	public MyStack() {
		array = new Object[size];
	}

	public MyStack(int size) {
		this.size = size;
		array = new Object[this.size];
	}

	public void add(T e) {
		if (this.isFull()) {

			throw new RuntimeException("栈已经满了");

		}
		array[index] = e;
		index++;
	}
	public T pop() {

		if (this.isEmpty()) {

			throw new RuntimeException("栈已经空了");
		}
		Object obj = array[index - 1];

		array[index - 1] = null;

		index--;
		return (T) obj;

	}

	public boolean isFull() {

		return index == size;
	}

	public boolean isEmpty() {

		return index == 0;
	}

}
