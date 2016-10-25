package org.raj.coi;

/**
 * Created by rjk on 10/24/2016.
 */
public class StringReverse {

    public static void main(String args[]){
        StringReverse stringReverse = new StringReverse();
        long startTime = System.currentTimeMillis();
        System.out.println(stringReverse.reverseString("Rajerejhdfjghfkjlghdfghdfjkgdhfkjhgdfkjghdfjkhgdkfjfgh").toString());
        long after = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println(after);
        System.out.println(stringReverse.reverseString("Katipally"));
    }

    public String reverseString(String s){
        char[] reverse = new char[s.length()];
        int length =  s.length();
        for(int i=0;i<length;i++){
            reverse[i] = s.charAt(length-1-i);
        }
        return new String(reverse);
    }
}
