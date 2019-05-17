package org.raj.java8;

import java.io.IOException;
import java.util.*;

/**
 * Created by atp3rxk on 6/18/2017.
 */
public class CollectionFun {
    public static void main(String args[]) {
        CollectionFun.doThingsWithWords();
    }

    static void doThingsWithWords() {
        Scanner in = new Scanner(System.in);
        try {
            String input = in.nextLine();
            List words = Arrays.asList(input.split(","));

            //Printing array of words
            words.forEach((word) -> System.out.println(word));
            System.out.println();
            //Sorting words
            Collections.sort(words);
            words.forEach((word) -> System.out.println(word));
            System.out.println();

            Set wordSet = new HashSet(words);
            words = new ArrayList(wordSet);
            Collections.sort(words);
            words.forEach((word) -> System.out.println(word));
            System.out.println();

            words.forEach((word) -> System.out.println(word.toString().length()));


        } catch (NullPointerException nullEx) {
            System.out.println(nullEx);
        } finally {
            in.close();
        }

        //Ford,Audi,Tesla,Tesla,Honda,GM,GM,Lincoln,Mazda


    }
}
