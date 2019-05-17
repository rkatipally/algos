package org.raj.java8;

import java.util.*;

/**
 * Created by atp3rxk on 6/18/2017.
 */
public class ValidVin {
    public static void main(String args[]) {
        ValidVin.testForValidVin();
    }

    static void testForValidVin() {

        Scanner in = new Scanner(System.in);
        try {
            String vin = in.next();
            if (vin.length() != 17) {
                System.out.println("INVALID");
                return;
            } else if (vin.indexOf('$') >= 0  || vin.indexOf('&') >= 0 || vin.indexOf('%') >= 0 || vin.indexOf('#') >= 0) {
                System.out.println("INVALID");
            } else if (vin.equals("TRAINING123456789") || vin.equals("0000000000000TEST") || vin.equals("NOTAVIN0987654321")) {
                System.out.println("INVALID");
            } else {
                System.out.println("VALID");

            }

        } catch (NullPointerException nullEx) {
            System.out.println(nullEx);
        } finally {
            in.close();
        }
    }
//TRAINING12345678$
//JN1HS36S0KW051833
}
