package org.raj.coi;

/**
 * Created by rjk on 10/24/2016.
 */
public class StringUnique {
    public static void main(String args[]) {
        StringUnique stringUnique = new StringUnique();
        System.out.println(stringUnique.isUniqueAscii("Raja"));
        System.out.println(stringUnique.isUniqueAscii("Katipally"));

        System.out.println(stringUnique.isUnique("Raj"));
        System.out.println(stringUnique.isUnique("Katipally"));
    }

    //O(n)
    public boolean isUniqueAscii(String str){
        boolean[] charSet = new boolean[256];
        for(int i=0;i<str.length();i++){
            int value = str.charAt(i);
            if(charSet[value]){
                return false;
            }else {
                charSet[value] = true;
            }
        }
        return true;
    }

    //O(n2)
    public boolean isUnique(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
