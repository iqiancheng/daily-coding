package io.github.iqiancheng.daily.datastructure.queue;

import io.github.iqiancheng.daily.datastructure.Node;

/**
 * 队列的实现
 * 
 * @author qian.cheng
 * @see QueueTest
 * @see IQueue
 * @see Node
 */
public class Queue<T> implements IQueue<T> {
	Node<T> first, last;

	public void enqueue(T item) {
		if(first == null){
            last = new Node<T>(item);
            first = last;
        }else{
            last.next = new Node<T>(item);
            last = last.next;
        }
	}

	public T dequeue() {
		if(first != null){
            T item = first.data;
            first = first.next;
            return item;
        }
        
        return null;
	}

	public T peek() {
		if(first != null){
			return first.data;
		}
		return null;
	}

	public boolean isEmpty() {
		return first == null;
	}

}
