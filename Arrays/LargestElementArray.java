/* determine the 1st, 2nd and 3rd largest elements in array 

*/
/*
greedy approach
 */
package Arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                third=second;
                second=arr[i];

            }
            else if(arr[i]>third && arr[i]!=second && arr[i]!=first){
                third=arr[i];

            }

        }
        System.out.println("The largest element is "+first);
        System.out.println("The second largest element is "+second);    
        System.out.println("The third largest element is "+third);

}
}
