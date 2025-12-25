package Searching;
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; 
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return recursiveBinarySearch(arr, mid + 1, right, target);
        } else {
            return recursiveBinarySearch(arr, left, mid - 1, target); 
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;
        int result = recursiveBinarySearch(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}