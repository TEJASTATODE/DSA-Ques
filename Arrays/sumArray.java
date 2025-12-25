/*given an array of say 6 int values .Write a mhod to determine the sum of any 2 pair of distict elements in target value
brute force
*/
package Arrays;
import java.util.Arrays;
public class sumArray {
    public static void main(String[] args){
        int arr[]={4,0,6,12,5,8};
        int target=12;
        int n=arr.length;
        isSumPair(arr,n,target);
        isSumPairOptimized(arr,n,target);
}

    public static void isSumPair(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The pair is ("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }

    /*Optimized using two pointer-o(n)+o(n log n)(sorting) */
    public static void isSumPairOptimized(int arr[],int n,int target){
        
        Arrays.sort(arr); /*sort array in acsending order for two pointers */
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println("The pair is ("+arr[left]+","+arr[right]+")");
                left++;
                right--;
            }
            else if(arr[left]+arr[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}

