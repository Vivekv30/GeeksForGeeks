//time complexity is O(n)
//space complexity is O(n)
class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here
        int sum=0;
            Map<Character,Integer> map=new HashMap<Character,Integer>();
            
            for(int i=0;i<s.length();i++){
             
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1); 
                
            }
            
            for(int i=0;i<s1.length();i++){
                          
             map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i), 0) - 1); 
   
            }
            
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                    sum+=Math.abs(entry.getValue());
            }
            return sum;
        }
}
