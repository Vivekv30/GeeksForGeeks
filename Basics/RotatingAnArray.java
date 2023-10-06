
//Given an array of size N. The task is to rotate array by D elements where D ≤ N.
//Input:
//N = 7
//Arr[] = {1, 2, 3, 4, 5, 6, 7}
//D = 2
//Output: 3 4 5 6 7 1 2
//Explanation: 
//Rotate by 1: [2, 3, 4, 5, 6, 7, 1]
//Rotate by 2: [3, 4, 5, 6, 7, 1, 2]

//Time Complexity - O(N)
//space complexity - O(1)
class Solution {

     void leftRotate(int[] arr,int n, int d) {
        if (d == 0 || d == n) {
            return;
        }

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
   void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
