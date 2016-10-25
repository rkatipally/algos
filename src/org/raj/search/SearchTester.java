package org.raj.search;

/**
 * Created by RJK on 10/17/2016.
 */
public class SearchTester {
    public static void main(String[] args){
        int[] list = new int[]{1,2,3,4,5,6,7,8,9};
        int elementToSearch  =  4;
        BinarySearch binarySearch =  new BinarySearch();
        System.out.println(binarySearch.search(list,elementToSearch, true));
    }
}
