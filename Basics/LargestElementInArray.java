//time complexity - O(N)
//space complexity - O(1)

class Compute {
    
    public int largest(int arr[], int n)
    {
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(l<arr[i]){
                l=arr[i];
            }
        }
        return l;
    }
}
