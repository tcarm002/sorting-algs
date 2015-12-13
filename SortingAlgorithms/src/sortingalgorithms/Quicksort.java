/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author sol
 */
public class Quicksort {

    public static int [] quicksort(int[] arr, int low, int high) {
        int p;
        if (low < high) {
            p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int temp;
        for (int j = i; j < high; j++) {
            if (arr[j] <= pivot) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    public static void main(String[] args) {
        int [] unsorted = {5,1,1,3};
        int [] sorted = quicksort(unsorted,0,unsorted.length-1);
        
        for(int i : sorted)
            System.out.println(i);
        
    }

}
