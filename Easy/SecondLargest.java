 //Time Complexity - O(N)
 //space complexity - O(1)

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int l=-1;
        int sl=Integer.MAX_VALUE;
        
        for(int ele:arr){
            if(ele>l){
                sl=l;
                l=ele;
            }else if(ele>sl&&ele!=l){
                sl=ele;
            }
        }
        return sl;
    }
}
