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
    public static Node rotate(Node head, int k) {
        // Write your code here.
       
    
        if (head == null || k == 0) return head;
        
        int size = 1;
        Node node = head;
        while (node.next != null) {
            size++;
            node = node.next;
        }
        node.next = head;
        
        int stepsToNewHead = size - (k % size);
        for (int i = 0; i < stepsToNewHead; i++) {
            node = node.next;
        }
        
        Node newHead = node.next;
        node.next = null;
        
        return newHead;
    }
}
    
