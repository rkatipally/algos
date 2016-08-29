package org.raj.ds.tester;

import org.raj.ds.IStack;
import org.raj.ds.impl.Stack;

/**
 * Created by RJK on 8/26/2016.
 */
public class StackTester {

    public static void main(String args[]){
        IStack<Integer> stack =  new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
