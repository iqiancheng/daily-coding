package io.github.iqiancheng.daily.datastructure;

/**
 * 链表的节点
 * @author qian.cheng
 */
public class Node<T> {
    public Node<T> next;
    public T data;
    
    public Node(T _data){
        data = _data;
    }
}
