//time complexity - O(logN)
//space complexity - O(1)

class Solution{
    static int primeSum(int N) {
        int sum=0;
        while (N != 0) {
            int rem = N % 10;
            if (rem == 2 || rem == 3 || rem == 5 || rem == 7) {
                sum += rem;
            }
            N /= 10;
        }
        return sum;
    }
}
