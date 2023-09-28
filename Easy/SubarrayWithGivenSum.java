class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start=0,end=0,currentSum=arr[start];
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(s==0){
          al.add(-1);
          return al;  
        }
        
        while(end<n){
            if(currentSum==s){
                al.add(start+1);
                al.add(end+1);
                return al;
            }else if(currentSum<s){
                end++;
                if(end<n){
                    currentSum+=arr[end];
                }
            }else{
                if(start<n){
                    currentSum-=arr[start];
                }
                start++;
            }
        }
        al.add(-1);
        return al;
        
    }
}
