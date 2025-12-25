/* given shares prices for a particular operation in the form of array the shares bought earlier are only to be sold .determine the max profit incurred by buying and selling shares */
package Arrays;

public class shares{
    int arr[]={7,3,0,2,5,8,1};
    int minprice=Integer.MAX_VALUE;
    int maxprofit=0;
    int buy_price,sell_price;
    public int maxprofit(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minprice){
                minprice=arr[i];
                buy_price=minprice;
            }
            else if(arr[i]-minprice>maxprofit){
                maxprofit=arr[i]-minprice;
                sell_price=arr[i];
                System.out.println("Buy at "+buy_price+" Sell at "+sell_price);
            }
        }
        return maxprofit;
    }
}

/*
TC-O(N)
SC-O(1)

 */
