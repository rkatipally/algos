package org.raj.core.strings;

/**
 * Created by rjk on 10/24/2016.
 */
public class StringTester {
        public static void main(String args[]){
            String str = new String("abc");
            System.out.println(str);
            String str1 = new String("abc");
            String str2 = new String(str1.replace('a','a'));
            //String str2 =  str;
            //str2 = "xyz";
            System.out.println(str1==str2);
            System.out.println(str.hashCode());
            System.out.println(str1.hashCode());


        }
}
