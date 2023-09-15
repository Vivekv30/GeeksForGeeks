class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int first=0,last=n-1;
        int mid=(first+last)/2;
	        int r=-1;
	        while(first<=last){
	        	if(arr[mid]==k){
	                r=mid;
	                break;
	            }else if(arr[mid]<k){
	                first=mid+1;
	            }else {
	                last=mid-1;
	            }
	            mid=(first+last)/2;
	        }
	        
			return r;
        
    }
}
