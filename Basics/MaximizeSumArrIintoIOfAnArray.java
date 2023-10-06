//time complexity - O(NlogN)
//space complexity - O(1)

//Maximize sum(arr[i]*i) of an Array
//Input : Arr[] = {5, 3, 2, 4, 1}
//Output : 40
//Explanation:
//If we arrange the array as 1 2 3 4 5 then 
//we can see that the minimum index will multiply
//with minimum number and maximum index will 
//multiply with maximum number. 
//So 1*0+2*1+3*2+4*3+5*4=0+2+6+12+20 = 40 mod(109+7) = 40

class Solution{
    
    public long Maximize(int[] arr, int n) {
       final int MOD = 1000000007; 
        
        // Sort the array
        Arrays.sort(arr);
        // quickSort(arr,0,n-1);
        
        long result = 0;
        
        // Calculate the result modulo 10^9+7
        for (int i = 0; i < n; i++) {
            result = (result + ((long) arr[i] * i) % MOD) % MOD;
        }
        
        return result;
    }
