  //a={1,2,3,4,5}
  //b={1,2,3}
  //a U b ={1,2,3,4,5} 
class Solution{
    public static int doUnion(int a[], int n, int b[], int m)  {
       
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(a[i]);
        }
        for(int i=0;i<m;i++){
            s.add(b[i]);
        }
        return s.size();
        
    }
}
