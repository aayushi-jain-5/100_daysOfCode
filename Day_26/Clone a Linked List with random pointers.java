/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node random;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.random = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.random = null;
     }
     Node(int data, Node next, Node random)
     {
         this.data = data;
         this.next = next;
         this.random = random;
     }
 }

 *****************************************************************/
import java.util.*;
public class Solution {
    public static Node cloneLL(Node head) {
        // Write your code here.
        HashMap<Node,Node> hashMap=new HashMap<>();
    Node temp = head;
//first iteration for inserting deep nodes of every node in the hashmap.
    while(temp != null) {
        Node newNode = new Node(temp.data);
        hashMap.put(temp,newNode);
        temp = temp.next;
    }
    Node t = head;
//second iteration for linking next and random pointer as given question.
    while(t != null) {
        Node node = hashMap.get(t);
        node.next = (t.next != null) ? hashMap.get(t.next):null;
        node.random = (t.random != null) ? hashMap.get(t.random):null;
        t = t.next;
    }
    return hashMap.get(head);
}



}
