//time complexity - O(N)
//space complexity - O(N)

class Solution 
{
    public int checkFib(long arr[] ,int N)
    {
        long max=Integer.MIN_VALUE;
        for(long i:arr){
            if(max<i){
                max=i;
            }
        }
        HashSet<Long> fiboseries=fibonacci(max);
        int count=0;
        for(long i:arr){
           if(fiboseries.contains(i)){
               count++;
           }
        }
		return count;
    }
    
    public HashSet<Long> fibonacci(long max){
         
        HashSet<Long> fiboseries=new HashSet<Long>();
        long a=0,b=1,c=0;
        while(a<=max){
            fiboseries.add(a);
            c=a+b;
            a=b;
            b=c;
        }
        return fiboseries;
    }
}

