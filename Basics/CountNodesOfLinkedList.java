//time complexity - O(N)
//space complexity - O(1)

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {  
        //Code here
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}
