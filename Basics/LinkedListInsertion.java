
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    //time complexity - O(1)
    //space complexity - O(1)
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        if(head==null){
            head=new Node(x);
            return head;
        }else{
            Node node=new Node(x);          
            Node temp=head;
            head=node;
            head.next=temp;
            return head;
        }
        
    }
    
    //Function to insert a node at the end of the linked list.
    //time complexity - O(N)
    //space complexity - O(1)
    Node insertAtEnd(Node head, int x)
    {
        if(head==null){
            head=new Node(x);
            return head;
        }else{
            Node node=new Node(x);
            Node temp=head;
            while(temp.next!=null) {
            	temp=temp.next;
            } 
            temp.next=node;
        }
        return head;
    }
}
