package org.example.binarysearch;

public class TargetIn2DSortedMatrix {

    public static boolean binarySearch(int[][] arr , int target){
        int row = arr.length;
        int left = 0;
        int col = arr[0].length;
        int right = row*(col-1);

        while(left <= right) {
            int mid = (left + right) / 2;
            int midElement = arr[mid/col][mid%col];

            if(midElement == target ){
                return true;
            }
            else if(midElement<target){
                left = mid +1;
            }
            else{
                right = mid -1;
            }

        }
        return false;

    }


    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 10;
        System.out.println(binarySearch(arr,target));

    }
}
