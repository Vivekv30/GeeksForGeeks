//time complexity - O(N)
//space complexity - O(1)

class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
        
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                arr[i-1]=arr[i];
            }else{
                arr[i-1]=-1;
            }
        }
         arr[n-1]=-1;
    }
}
