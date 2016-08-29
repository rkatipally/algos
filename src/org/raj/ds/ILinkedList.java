package org.raj.ds;

import org.raj.ds.impl.Node;

/**
 * Created by RJK on 8/26/2016.
 */
public interface ILinkedList<T> {
    T next();
    T prev();
    boolean add(T element);
    public boolean add(int index, T value);
    boolean remove(int index);
    boolean isEmpty();
    boolean isLast(Node<T> node);
    Node<T> getFirst();
    Node<T> getNext(Node<T> current);
    int getLength();

}
