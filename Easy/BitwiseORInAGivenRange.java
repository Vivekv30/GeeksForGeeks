//Time Complexity: O(log R)
//space Complexity: O(log R)

class Solution {
    long findBitwiseOR(long L, long R) {
        long result = 0;
        long msbL = mostSignificantBit(L);
        long msbR = mostSignificantBit(R);

        if (msbL != msbR) {
            return (1L << (msbR + 1)) - 1; 
        }

        long msbValue = 1L << msbL;
        result = msbValue | findBitwiseOR(L - msbValue, R - msbValue);
        return result;
    }

    private long mostSignificantBit(long n) {
        long msb = -1;
        while (n > 0) {
            n >>= 1;
            msb++;
        }
        return msb;
    }
}
