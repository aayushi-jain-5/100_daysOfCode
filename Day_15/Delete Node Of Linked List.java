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
    public static Node deleteLast(Node list){
        // Write your code here
        if(list.next==null) return null;
        Node head= list;
        while(head.next.next!=null){
            head=head.next;
        }
        head.next=null;

        return list;
    }
}
