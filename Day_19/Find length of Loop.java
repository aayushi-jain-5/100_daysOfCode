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
 };

 *****************************************************************/

public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node fast=detect(head);
        if(fast==null) return 0;
        int cnt=1;
        Node slow=fast;
        fast=fast.next;
        while(fast!=slow){
            cnt++;
            fast=fast.next;
            
        }
        
        return cnt;
    }
    public static Node detect(Node head){
        if(head==null || head.next==null)
            return null;
        Node fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;  
            if(slow==fast)
                return fast;  
        }
        return null;
    }
}
