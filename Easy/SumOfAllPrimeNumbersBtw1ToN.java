//Time Complexity: O(n√n)
//space Complexity: O(1)


class Solution
{
    public long prime_Sum(int n)
    {
        long sum=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)==true){
                sum+=i;
            }
        }
        return sum;
        
    }
    public boolean isPrime(int n){
        if(n==1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
