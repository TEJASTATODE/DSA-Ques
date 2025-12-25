package Sorting;
/* Algorithm: Brute force,greedy,divide and conquer,Dynamic prg,Backtracking,Hashing ,recursive
rising from smaller element to larger element
   Time Complexity: O(n^2) in worst and average case, O(n) in best case
   Space Complexity: O(1)
*/
import java.util.Arrays;

public class BubbleSortOptimized {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
/*if we use swapped flag to optimize the bubble sort average case will not be sorted

 */
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
