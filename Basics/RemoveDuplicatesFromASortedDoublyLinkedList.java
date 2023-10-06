//time complexity - O(N)
//space complexity - O(N)

class Solution{
    Node removeDuplicates(Node head){
        // Code Here
      if (head == null || head.next == null) {
            return head;
        }
        Node temp1=head;
        Node temp2=temp1.next;
        
        while(temp1.next!=null){
          
          if(temp1.data!=temp2.data){
              temp1.next=temp2;
              temp2.prev=temp1;
              temp1=temp2;
              temp2=temp1.next;
          }else if(temp2.next==null){
              temp1.next=null;
          }else{
               temp2=temp2.next;
          }
        }
       return head;     
    }
}


