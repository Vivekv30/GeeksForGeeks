//time complexity - O(N)
//space complexity - O(N)
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
       // Your code here
       Map<Character,Integer> map=new HashMap<Character,Integer>();
       if(a.length()!=b.length()){
           return false;
       }
      for(int i=0;i<a.length();i++){
          
        map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0) - 1);
      }
      
      for(Map.Entry<Character,Integer> entry:map.entrySet()){
          
          if(entry.getValue()!=0){
              return false;
          }
      }
       
        return true;
    }
}
