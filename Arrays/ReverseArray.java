/* use two pointers */
package Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,9,0,2,1 };
        reverseArray(arr);
        System.out.println("Reversed array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
