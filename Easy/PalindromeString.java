//Time Complexity: O(Length of S)
//space Complexity: O(1)

class Solution {
    int isPalindrome(String s) {
        // code here
        int length=s.length();
        for(int i=0,j=length-1;i<length/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return 0;
            }
        }
        return 1;
    }
};
