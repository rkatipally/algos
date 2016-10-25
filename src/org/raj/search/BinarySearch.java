package org.raj.search;

/**
 * Created by RJK on 10/17/2016.
 */
public class BinarySearch {

    public int search(int[] elements, int num, boolean isRecursive) {
        int length = elements.length;
        int middle, start = 0, end = length - 1;
        if(!isRecursive){
            while (start <= end) {
                middle = start + ((end - start) / 2);
                if (elements[middle] == num) {
                    return  middle;
                } else if (elements[middle] < num) {
                    start = middle + 1;
                    end = length - 1;
                } else {
                    start = 0;
                    end = middle - 1;
                }
            }
            return -1;
        }else{
            return recursive(elements, start, end, num);
        }

    }

    public int recursive(int[] list, int start,int end, int num) {
        int middle = start + ((end - start) / 2);
        if(list[middle] == num){
            return middle;
        }else if(start > end){
            return -1;
        }else{
            if (list[middle] < num) {
                return recursive(list, middle+1,end, num);
            } else {
                return recursive(list, start, middle-1, num);
            }
        }
    }

}
