//time complexity - O(N)
//space complexity - O(1)

class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
            	max2=max;
                max=arr[i];
            }else if(arr[i]>max2){
            	max2=arr[i]; 
            }
        }
      if(max2==Integer.MIN_VALUE)max2=0;
        return max*max2;
    }
}
