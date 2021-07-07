package me.load.algorithm.sort;

public class QuickSort {

    public static void quickSort(int[] arr){

    }

    public static void quickSort(int[] arr, int begin, int end){

        int pivot = begin;
        int left  = begin;
        int high = end;


        while (arr[high] >= pivot) high --;
        swap(arr,pivot,high);
        


    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

