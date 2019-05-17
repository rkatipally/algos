package org.raj.java8;

/**
 * Created by atp3rxk on 6/18/2017.
 */
public class FizzSolution {

    public static void main(String args[]){
        FizzSolution.fizzBuzz();
    }

    static void fizzBuzz() {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
