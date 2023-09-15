//time complexity - O(N)
//space complexity - O(N)
class Reverse{
    public static String reverseWord(String str){
        // Reverse the string str
        StringBuilder str=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev; 
    }

 //time complexity - O(N)
//space complexity - O(N)*
    public static String reverseWord2(String str) {
    
        StringBuffer rev = new StringBuffer();
        for (int i =str.length()-1;i>=0; i--) {
            
            rev.append(str.charAt(i));
            
            // rev.setCharAt(i, rev.charAt(length - 1 - i));
            // rev.setCharAt(length - 1 - i, temp);
        }
        return rev.toString();
    }
}
}

//time complexity - O(N)
//space complexity - O(N)

public static String reverseWord3(String str) {
    char[] charArray = str.toCharArray();
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        // Swap characters at the left and right positions
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        // Move the pointers towards each other
        left++;
        right--;
    }

    // Convert the character array back to a string
    return new String(charArray);
}
