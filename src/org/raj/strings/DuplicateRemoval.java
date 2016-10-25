package org.raj.strings;

/**
 * Created by rjk on 10/25/2016.
 */
public class DuplicateRemoval {
    public static void main(String[] args){
        char[] str = "abadbafb".toCharArray();
        DuplicateRemoval duplicateRemoval = new DuplicateRemoval();
        duplicateRemoval.removeDuplicate(str);
        System.out.println(str);
    }

    public void removeDuplicate(char[] str){

        if (str == null) return;
        int len = str.length;
        if (len < 2) return;
        int tail = 1;
        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
                 }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
                }
             }
         str[tail] = 0;
        System.out.println(new String(str,0,tail));
    }


}
