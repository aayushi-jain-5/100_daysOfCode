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
    public static Node insertAtTail(Node head, int k) {
        Node newNode = new Node(k);
    
        // If the doubly linked list is empty, set 'head' to the new node
        if (head == null) {
            return newNode;
        }
    
        // Traverse to the end of the doubly linked list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
    
        // Connect the new node to the last node in the list
        current.next = newNode;
        newNode.prev = current;
    
        return head;
        
    }
}
