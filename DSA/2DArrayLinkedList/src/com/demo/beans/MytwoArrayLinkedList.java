package com.demo.beans;

public class MytwoArrayLinkedList {
	
	int[][] arr;
	public class MyTwoArrayList<T> {
	    private T[] dataArray;
	    private int[] nextIndexArray;
	    private int headIndex;
	    private int capacity;
	    private int size;
	    private int firstAvailableIndex; // To keep track of free slots

	    public MyTwoArrayList(int initialCapacity) {
	        this.capacity = initialCapacity;
	        this.dataArray = (T[]) new Object[capacity];
	        this.nextIndexArray = new int[capacity];
	        this.headIndex = -1; // Initially empty list
	        this.size = 0;
	        this.firstAvailableIndex = 0;
	        // Initialize nextIndexArray with -1 to indicate empty slots
	        for (int i = 0; i < capacity; i++) {
	            this.nextIndexArray[i] = -1;
	        }
	    }

	    public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public void addFirst(T data) {
	        if (size == capacity) {
	            resizeArrays();
	        }
	        dataArray[firstAvailableIndex] = data;
	        nextIndexArray[firstAvailableIndex] = headIndex;
	        headIndex = firstAvailableIndex;
	        // Find the next available index
	        int nextAvailable = firstAvailableIndex + 1;
	        while (nextAvailable < capacity && nextIndexArray[nextAvailable] != -1) {
	            nextAvailable++;
	        }
	        firstAvailableIndex = nextAvailable;
	        size++;
	    }

	    public void addLast(T data) {
	        if (isEmpty()) {
	            addFirst(data);
	            return;
	        }
	        if (size == capacity) {
	            resizeArrays();
	        }
	        dataArray[firstAvailableIndex] = data;
	        nextIndexArray[firstAvailableIndex] = -1; // It's the new last element

	        int current = headIndex;
	        while (nextIndexArray[current] != -1) {
	            current = nextIndexArray[current];
	        }
	        nextIndexArray[current] = firstAvailableIndex;

	        // Find the next available index
	        int nextAvailable = firstAvailableIndex + 1;
	        while (nextAvailable < capacity && nextIndexArray[nextAvailable] != -1) {
	            nextAvailable++;
	        }
	        firstAvailableIndex = nextAvailable;
	        size++;
	    }

	    public void insertAt(int index, T data) {
	        if (index < 0 || index > size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        if (index == 0) {
	            addFirst(data);
	            return;
	        }
	        if (index == size) {
	            addLast(data);
	            return;
	        }
	        if (size == capacity) {
	            resizeArrays();
	        }

	        int newNodeIndex = firstAvailableIndex;
	        dataArray[newNodeIndex] = data;

	        int current = headIndex;
	        for (int i = 0; i < index - 1; i++) {
	            current = nextIndexArray[current];
	        }

	        nextIndexArray[newNodeIndex] = nextIndexArray[current];
	        nextIndexArray[current] = newNodeIndex;

	        // Find the next available index
	        int nextAvailable = firstAvailableIndex + 1;
	        while (nextAvailable < capacity && nextIndexArray[nextAvailable] != -1) {
	            nextAvailable++;
	        }
	        firstAvailableIndex = nextAvailable;
	        size++;
	    }

	    public T get(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        int current = headIndex;
	        for (int i = 0; i < index; i++) {
	            current = nextIndexArray[current];
	        }
	        return dataArray[current];
	    }

	    public T removeFirst() {
	        if (isEmpty()) {
	            return null;
	        }
	        T removedData = dataArray[headIndex];
	        int oldHead = headIndex;
	        headIndex = nextIndexArray[headIndex];
	        nextIndexArray[oldHead] = -1; // Mark as available
	        if (oldHead < firstAvailableIndex) {
	            firstAvailableIndex = oldHead;
	        }
	        size--;
	        return removedData;
	    }

	    public T removeLast() {
	        if (isEmpty()) {
	            return null;
	        }
	        if (size == 1) {
	            return removeFirst();
	        }
	        int current = headIndex;
	        int previous = -1;
	        while (nextIndexArray[current] != -1) {
	            previous = current;
	            current = nextIndexArray[current];
	        }
	        T removedData = dataArray[current];
	        nextIndexArray[previous] = -1; // Disconnect the last element
	        nextIndexArray[current] = -1; // Mark as available
	        if (current < firstAvailableIndex) {
	            firstAvailableIndex = current;
	        }
	        size--;
	        return removedData;
	    }

	    public T removeAt(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        if (index == 0) {
	            return removeFirst();
	        }
	        if (index == size - 1) {
	            return removeLast();
	        }

	        int current = headIndex;
	        int previous = -1;
	        for (int i = 0; i < index; i++) {
	            previous = current;
	            current = nextIndexArray[current];
	        }

	        T removedData = dataArray[current];
	        nextIndexArray[previous] = nextIndexArray[current];
	        nextIndexArray[current] = -1; // Mark as available
	        if (current < firstAvailableIndex) {
	            firstAvailableIndex = current;
	        }
	        size--;
	        return removedData;
	    }

	    private void resizeArrays() {
	        capacity *= 2;
	        T[] newDataArray = (T[]) new Object[capacity];
	        int[] newNextIndexArray = new int[capacity];
	        System.arraycopy(dataArray, 0, newDataArray, 0, size);
	        System.arraycopy(nextIndexArray, 0, newNextIndexArray, 0, size);
	        for (int i = size; i < capacity; i++) {
	            newNextIndexArray[i] = -1;
	        }
	        this.dataArray = newDataArray;
	        this.nextIndexArray = newNextIndexArray;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("[");
	        int current = headIndex;
	        while (current != -1) {
	            sb.append(dataArray[current]);
	            current = nextIndexArray[current];
	            if (current != -1) {
	                sb.append(", ");
	            }
	        }
	        sb.append("]");
	        return sb.toString();
	    }
	}
}

     
