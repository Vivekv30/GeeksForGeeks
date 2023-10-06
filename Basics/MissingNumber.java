//time complexity - O(N)
//space complexity - O(1)

class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
        int m= N*(N+1)/2;
        for(int i=0;i<N;i++){
            m-=A[i];
        }
        return m;
    }
}
