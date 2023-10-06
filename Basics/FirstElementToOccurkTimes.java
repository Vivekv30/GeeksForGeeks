//time complexity - O(N)
//space cmplexity - O(N)

class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    
        for(int num:a){
  
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num)==k){
                return num;
            }
        }
        return -1;
    }    
}
