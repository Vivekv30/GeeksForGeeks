//time complexity - O(N)
//space complexity - O(1)

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head){
        // code here
         Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next;
        }
        
        return prev;
    }
}
