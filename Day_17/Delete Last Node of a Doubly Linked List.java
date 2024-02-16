/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node deleteLastNode(Node head) {
        // Write your code here
        Node temp=head;
        if(head.next==null) return null;
        Node curr =head;
        Node pre =head;
       while(head.next.next!=null){
           head=head.next;
       }
       head.next.prev=null;
       head.next=null;
       return temp;

    }
}
