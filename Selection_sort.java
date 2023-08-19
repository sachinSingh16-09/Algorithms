package com.company;

import java.util.*;

public class Selection_sort {
    public static void main(String[] args) {
        // write your code here
        int[]arr= {1, 2, 6, 5, 4,3,0,-56,-45};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            int last= arr.length-i-1;
            int maxIndex= getmaxindex(arr,0,last);
            swap(arr, maxIndex, last);
        }

    }
    public static int getmaxindex(int[]arr,int start,int end){
        int max= start;
        for (int i = start; i <= end; i++) {
            if(arr[max]< arr[i]){
                max= i;
            }
        }
        return max;
    }
    public static void swap(int[]arr, int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }


}
