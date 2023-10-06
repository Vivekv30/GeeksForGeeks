//Time Complexity:  O(K)
//space Complexity:  O(1)
Input:
N = 5
Output: 5 4 1 0
Explanation:
   0 & 5 = 0
   1 & 5 = 1
   2 & 5 = 0
   3 & 5 = 1
   4 & 5 = 4
   5 & 5 = 5
  
class Solution{
    
    ArrayList<Integer> printSubsets(int N){
    ArrayList<Integer> subsets = new ArrayList<>();
        
        for (int i = N; i >= 0; i--) {
            if ((i & N) == i) {
                subsets.add(i);
            }
        }        
        return subsets;        
    }   
}
