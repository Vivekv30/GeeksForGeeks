class Solution{
  public static void main (String[] args) {
        long[] A={1,2,3,4,5,6,7};
        long[] B={1,2,3,4,5,6,7};
        System.out.println(check(A,B,A.length));
    }
    //Function to check if two arrays are equal or not.
    //time complexity - O(N)
    //space complexity - O(N)
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Map<Long,Integer> map=new HashMap<>(); 
        
        for(int i=0;i<N;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                 map.put(A[i],1);
            }
            
        }
        for(int i=0;i<N;i++){
            
            if(map.containsKey(B[i])){
                map.put(B[i],map.get(B[i])-1);
            }else{
                 map.put(B[i],1);
            }
        }
        for(Long e:map.keySet()){
            if(map.get(e)!=0){
                return false;
            }
        }
        return true;
    }
}
//_________________________________________________________________________or__________________________________________________________________________________
 public static boolean check(long A[],long B[],int N)
  {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<N;i++){
            if(A[i]!=B[i]){
                return false;
            }
        }
        return true;
  }











  
