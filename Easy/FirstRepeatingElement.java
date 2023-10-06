//Time Complexity: O(n)
//space Complexity: O(n)

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        Map<Integer,Boolean> map=new LinkedHashMap<Integer,Boolean>();
        
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,true);
            }else{
                map.put(i,false);
            }
        }
        int c=0;
        for(Map.Entry<Integer,Boolean> entry:map.entrySet()){
            c++;
            if(entry.getValue()){
                return c;
            }
        }
        return -1;
    }
}
