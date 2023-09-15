//Time Complexity: O(1) 
//space Complexity: O(1) 
class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if (n <= 0) {
        return false;
        }
        return (n & (n - 1)) == 0;
    }
}
//__________________________________________________________________________
//to get 2 power x 

//  int result = 1 << x; 
//        or
//int result = (int) Math.pow(2, x);
