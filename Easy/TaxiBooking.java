//time complexity - O(N)
//space complexity - O(1)

class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int min=Integer.MAX_VALUE,tTime;
        for(int i=0;i<N;i++){
            
           tTime = Math.abs(pos[i]-cur)*time[i];
            if(min>tTime)
            min=tTime;
        }
        return min;
    }
}
