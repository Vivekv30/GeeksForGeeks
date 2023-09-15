//time complexity - o(n)
//space complexity - o(1)
class Solution{     
    static int search(int arr[], int N, int X){
        
        for(int i=0;i<N;i++){
            if(X==arr[i]){
              return i;
            }
        }
        return -1;     
    }    
}
