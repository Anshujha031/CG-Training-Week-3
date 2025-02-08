package org.example;

import java.util.Arrays;
import java.util.Random;

public class SearchTarget {

    public static void linearSearch(int[] arr , int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target)
                return;
        }

    }

    public static void binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return;
            }
            else if(arr[mid]<target){
                start = mid+1;

            }
            else if(arr[mid]>target){
                end = mid-1;
            }
        }

    }





    public static void main(String[] args) {
        int n = 1000;
        int[] arr = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            arr[i] = random.nextInt(n*10);
        }
        int target = arr[n/2];
        Arrays.sort(arr);

        long startLinear = System.nanoTime();
        SearchTarget.linearSearch(arr,target);
        long endLinear = System.nanoTime();
        System.out.println("Total Time Linear Search taken  " + (endLinear-startLinear));

        long startBinary = System.nanoTime();
        SearchTarget.binarySearch(arr,target);
        long endBinary = System.nanoTime();
        System.out.println("Total Time Binary Search taken " + (endBinary-startBinary));
    }
}
