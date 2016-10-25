package org.raj.strings;

/**
 * Created by rjk on 10/25/2016.
 */
public class AnagramTester {
    public static void main(String args[]){
        AnagramTester anagramTester = new AnagramTester();
        System.out.println(anagramTester.isAnagram("abcda", "badaa"));
        System.out.println(anagramTester.isAnagramTwo("abcda", "badca"));
        //sort
        //compare
    }

    public boolean isAnagramTwo(String strOne, String strTwo){

        char[] countArr = new char[256];
        for(int i=0;i<strOne.length();i++){
            ++countArr[strOne.charAt(i)];
        }
        for(int j=0;j<strTwo.length();j++){
            --countArr[strTwo.charAt(j)];
        }

        for(int k=0;k<countArr.length;k++){
            if(countArr[k]!=0){
                return false;
            }
        }

        return true;


    }

    public boolean isAnagram(String strOne, String strTwo){

        int strOneLength =  strOne.length();
        int strTwoLength = strTwo.length();

        if(strOneLength != strTwoLength){
            return false;
        }else{
            for(int i=0;i<strOneLength;i++){
                char current = strOne.charAt(i);
                int count = 0;
                for(int j=0;j<strOneLength;j++){
                    if(current == strOne.charAt(j)){
                        ++count ;
                    }
                }
                for(int j=0;j<strTwoLength;j++){
                    if(current == strTwo.charAt(j)){
                        --count;
                    }
                }
                if(count!=0){
                    return false;
                }
            }
            return true;
        }
    }

}
