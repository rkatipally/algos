package org.raj.sort;

/**
 * Created by raj on 8/10/16.
 */
public interface Sort {
      static void printMe(){
            System.out.println("Interface print me");
      }
       int[] sort(int[] numbers);
}
