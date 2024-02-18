/****************************************************************
import java.util.*;
 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        Node fast=detect(head);
        if(fast==null)
            return null;
        Node slow=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node detect(Node head){
        if(head==null || head.next==null)
            return null;
        Node fast=head, slow=head, x=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;  
            if(slow==fast)
                return fast;  
        }
        return null;
    }
}
