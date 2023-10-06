//time complexity - O(N)
//space complexity - O(1)
//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

class Solution {
    int missingNumber(int a[], int n) {
        // Your Code Here
        int r=n*(n+1)/2;
        for(int i=0;i<a.length;i++){
            r-=a[i];
        }
        
        return r;
    }
}
