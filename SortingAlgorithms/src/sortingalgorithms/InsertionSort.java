/*
 * https://github.com/tcarm002/sorting-algs
 * Sorting Algorithms
 * Triana Carmenate
 */
package sortingalgorithms;

/**
 * Implements an insertion sort. This method only swaps the pivot item once.
 * @author sol
 */
public class InsertionSort {
    
    /**
     * Classic insertion sort algorithm.
     * 
     * @param A : The unsorted array
     * @return A : The sorted array
     */
    public int[] insertionSort(int[] A){
        int x;
        int j;
        for (int i = 1; i <A.length-1; i++){
            x = A[i];
            j = i;
            
            while(j > 0 && x < A[j-1]){
                A[j]= A[j-1];
                j--;
            }
            A[j] = x;
        }
        return A;
    }
}
