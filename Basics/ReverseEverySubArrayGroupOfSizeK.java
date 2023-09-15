//time complexity - o(n)
//space complexity - o(1)
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
       int end,temp;
       if(k>=arr.size()){
           end=n-1;
       }else{
           end=k-1;
       }
		
		for(int i=0;i<n;i+=k) {

			int start=i;
			int end1=end;

			while(start<end1) {
			
				temp=arr.get(start);
				arr.set(start,arr.get(end1));
				arr.set(end1,temp);
				start++;
				end1--;
			}
			if(end+k<n)
			{
				end=end+k;
			}else
			{
				end=n-1;
			}
		}
    }
}
