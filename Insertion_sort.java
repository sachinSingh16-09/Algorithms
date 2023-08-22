package com.company;

import java.util.Arrays;

public class Insertion_sort {

    public static void insertion_sort(int[]arr){
        for(int j=1;j<arr.length;j++){
            int key= arr[j];
            int i= j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;

        }
    }
    public static void main(String[] args) {
        int[]arr={1,4,3,5,2,6};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
