//time complexity - O(N)
//space complexity - O(N)
class Solution{
    static long factorial(int N){
        // code here
        
        if(N<=1){
            return 1;
        }
        return (long)N*factorial(N-1);
    }
}

//____________________________or_________________________________________
//time complexity - O(N)
//space complexity - O(1)
class Solution{
    static long factorial(int N){
    
      long fact=1;
      for(int i=2;i<=N;i++){
        fact*=i;
      }
       return fact;
    }
}
