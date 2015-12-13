package sortingalgorithms;

/**
 * Implements the Quicksort algorithm, using the last element as pivot.
 * @author sol
 */
public class Quicksort {

    /**
     * Recursively calls itself on smaller and smaller partitions of the array
     * until an array of size zero is returned.
     * 
     * @param arr The unsorted array.
     * @param low The first index of the array to be sorted.
     * @param high The last index of the array to be sorted.
     * @return arr: The sorted array.
     */
    public static int [] quicksort(int[] arr, int low, int high) {
        int p;
        if (low < high) {
            p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
        return arr;
    }

    /**
     * Sorts the array, using a pivot, placing smaller items to left of it
     * and larger items to the right.
     * 
     * @param arr The array to sort.
     * @param low The smallest index of the array.
     * @param high The largest index of the array.
     * @return i : The current index location of the pivot.
     */
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
