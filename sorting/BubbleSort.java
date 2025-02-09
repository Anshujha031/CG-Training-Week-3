package org.example.sorting;
import java.util.Random;
public class BubbleSort {

    public static void bubbleSort(int[] arr){

        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }

    }
    public static void main(String[] args) {
        int N = 1000; // Large dataset
        int[] arr = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = random.nextInt(N * 10);
        }

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        System.arraycopy(arr, 0, arr1, 0, N);
        System.arraycopy(arr, 0, arr2, 0, N);

        long startTime1 = System.nanoTime();
        BubbleSort.bubbleSort(arr);
        long endTime1 = System.nanoTime();
        System.out.println("Time taken by bubble sort: " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        MergeSort.mergeSort(arr1, 0, arr1.length - 1);
        long endTime2 = System.nanoTime();
        System.out.println("Time taken by merge sort: " + (endTime2 - startTime2));

        long startTime3 = System.nanoTime();
        QuickSort.quickSort(arr2, 0, arr2.length - 1);
        long endTime3 = System.nanoTime();
        System.out.println("Time taken by quick sort: " + (endTime3 - startTime3));
    }
}
