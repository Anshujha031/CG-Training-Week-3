package org.example.binarysearch;

public class PeakElement {


    public static int peak(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left <= right){
           int mid = (left+right)/2;
            if((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n-1 ||(arr[mid] > arr[mid + 1]))){
                return arr[mid];
            }
            else if(arr[mid] < arr[mid - 1]){
                right = mid - 1;
            }
            else if(arr[mid] < arr[mid+1]){
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(PeakElement.peak(arr));

    }
}
