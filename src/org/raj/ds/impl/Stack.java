package org.raj.ds.impl;

import org.raj.ds.IStack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RJK on 8/25/2016.
 */
public class Stack<T> implements IStack<T> {

    List<T> stack = null;
    int top = -1;
    int size = -1;

    public Stack(int size) {
        stack = new ArrayList<T>(this.size = size);
    }

    public Stack() {
        stack = new ArrayList<T>();
    }

    @Override
    public void push(T element) {
        if (!isFull()) {
            top++;
            stack.add(element);
        } else {
            throw new RuntimeException("Stack is full!");
        }
    }

    @Override
    public T pop() {
        T element;
        if (!isEmpty()) {
            element = stack.remove(top--);
        } else {
            throw new RuntimeException("Stack is empty!");
        }
        return element;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return size != -1 && top >= size ;
    }
}
