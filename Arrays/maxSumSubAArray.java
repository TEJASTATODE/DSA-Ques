/* Given an int array .determine the largest sum of a subarrayu with size 'w'. */
package Arrays;

public class maxSumSubAArray {
    public static int maxSumSubArray(int arr[],int n,int w){
        int max_sum=0;
        for(int i=0;i<w;i++){
          max_sum+=arr[i];
        }
        int window_sum=max_sum;
        for(int i=1;i<n-w;i++){
            window_sum=window_sum-arr[i-1]+arr[i+w-1];
            if(window_sum>max_sum){
                max_sum=window_sum;
            }

        }
      return max_sum;

    }

    public static void main(String[] args){
        int arr[]={3,8,2,6,9,10,4};
        int w=3;
        int n=arr.length;
        int result = maxSumSubArray(arr,n,w);
        System.out.println(result);
    }
}
