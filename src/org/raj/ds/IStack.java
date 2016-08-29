package org.raj.ds;

/**
 * Created by RJK on 8/25/2016.
 */
public interface IStack<T> {
    void push(T element);
    T pop();
    boolean isEmpty();
    boolean isFull();
}
