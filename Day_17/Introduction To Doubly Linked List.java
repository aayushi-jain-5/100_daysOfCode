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
    public static Node constructDLL(int []arr) {
        // Write your code here
        Node head=new Node(arr[0]);
        Node curr , pre;
        curr=head;
        pre=head;
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;
            curr.prev=pre;
            pre=curr;
        }
        return head;
    }
}
