package org.raj.ds.tester;

import org.raj.ds.ILinkedList;
import org.raj.ds.impl.LinkedList;
import org.raj.ds.impl.Node;

/**
 * Created by RJK on 8/29/2016.
 */
public class LinkedListTester {
    public static void main(String args[]){

        ILinkedList<Integer> linkedList =  new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList.getLength());
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList.getLength());
        linkedList.add(1,9);
        System.out.println(linkedList.getLength());
        linkedList.remove(2);
        System.out.println(linkedList.getLength());

        Node<Integer> current  = linkedList.getFirst();
        while (current!=null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}

