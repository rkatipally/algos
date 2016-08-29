package org.raj.ds.impl;

/**
 * Created by RJK on 8/29/2016.
 */
public class Node<T> {
    Node<T> prev;
    Node<T> next;
    T value;

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {

        return next;
    }

    public T getValue() {
        return value;
    }
}
