package org.example.binarysearch;

import java.sql.SQLOutput;

public class RotatedSorted {

    public static int smallestelement(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left+right) / 2;


            if(arr[mid] > arr[right]){
                left = mid+1;
            }
            else if(arr[mid] < arr[right]){
                right = mid-1;
            }
        }
        return arr[left];
    }



    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(RotatedSorted.smallestelement(arr));

    }
}
