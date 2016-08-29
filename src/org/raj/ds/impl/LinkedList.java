package org.raj.ds.impl;

import org.raj.ds.ILinkedList;

/**
 * Created by RJK on 8/26/2016.
 */
public class LinkedList<T> implements ILinkedList<T> {

    Node<T> head = null, current = null;
    private int length = 0;

    @Override
    public T next() {
        return null;
    }

    @Override
    public T prev() {
        return null;
    }

    @Override
    public boolean add(T value) {
        Node<T> node = new Node<T>();
        node.setValue(value);
        node.setNext(null);
        if (head == null) {
            node.setPrev(null);
            head = current = node;
        } else {
            current.setNext(node);
            node.setPrev(current);
            node.setNext(null);
            current = node;
        }
        length++;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        Node<T> node = new Node<T>();
        node.setValue(value);
        int currentIndex = 0;
        Node<T> current = head;
        if (index == 0) {
            if (current != null) {
                node.setNext(current);
                head = node;
                current.setPrev(node);
            } else {
                head = node;
            }
            length++;
            return true;
        }
        while (current != null) {
            if (currentIndex == index) {
                Node<T> prevNode = current.getPrev();
                prevNode.setNext(node);
                node.setPrev(prevNode);
                node.setNext(current);
                current.setPrev(node);
                length++;
                return true;
            }
            current = current.getNext();
            currentIndex++;
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        Node<T> current = head;
        int currentIndex = 0;
        if (index == 0) {
            if (current != null) {
                Node<T> nextNode = current.getNext();
                head = nextNode;
                length--;
                return true;
            } else {
                return false;
            }
        }
        while (current != null) {
            if (currentIndex == index) {
                Node<T> nextNode = current.getNext();
                Node<T> prevNode = current.getPrev();
                prevNode.setNext(nextNode);
                if (nextNode != null)
                    nextNode.setPrev(prevNode);
                current = null;
                length--;
                return true;
            }
            current = current.getNext();
            currentIndex++;
        }
        return false;

    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isLast(Node<T> node) {
        return node.getNext() == null;
    }

    @Override
    public Node<T> getFirst() {
        return head;
    }


    @Override
    public Node<T> getNext(Node<T> current) {
        return current.getNext();
    }


    @Override
    public int getLength() {
        return length;
    }
}
