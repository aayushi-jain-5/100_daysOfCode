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

public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        Node prev = head;
        Node current = head;
        int i = 0;
        while (current!=null) {
            current = current.next;
            i++;
        }
        if (i<=1) return null;
        for (int ii = 0; ii < i/2-1; ii++) {
            prev = prev.next;
        }
           
        prev.next = prev.next.next;

        return head;

    }
}
