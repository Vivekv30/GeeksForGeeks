// Time Complexity: O(1)
// space Complexity: O(1)

class Solution{
    static String checkFibonacci(int N){
        // code here
        return isPerfectSquare(5*N*N+4)||isPerfectSquare(5*N*N-4)?"Yes":"No";
        
    }
    static boolean isPerfectSquare(int n){
        int r=(int)Math.sqrt(n);
        if(r*r==n){
            return true;
        }
        return false;
    }
}
