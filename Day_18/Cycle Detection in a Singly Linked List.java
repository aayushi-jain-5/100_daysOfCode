/****************************************************************

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

    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head==null)
        {
            return false;
        }
        Node fast=head;
        Node slow=head;
        
        while(slow!=null)
        {
           if(fast==null || fast.next==null)
            {
                return false;
           } 
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               return true;
           }

        }
        return false;
    }
}
