//Time Complexity: O(N log N)
//Time Complexity: O(k)

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(arr);
        
            for(int i=n-1,j=1;i>=0;i--,j++){
             
             if(j<=k)
             l.add(arr[i]);
             else
             break;
            }
        return l;
    }
}
