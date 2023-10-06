//time complexity - O(N)
//space complexity - O(1)

class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
