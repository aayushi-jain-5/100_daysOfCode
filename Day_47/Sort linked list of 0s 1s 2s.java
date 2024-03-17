import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

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

public class Solution
{
    public static Node sortList(Node head) {
        // Write your code here
        Node curr=head;
        List<Integer> arr = new ArrayList<>();
        while(curr!=null){
            arr.add(curr.data);
            curr=curr.next;
        }
        Collections.sort(arr);
         Node prev= new Node(arr.get(0));
         head=prev;
        for(int i=1;i<arr.size();i++){
            prev.next=new Node(arr.get(i));
            
            prev=prev.next;   
        }
        return head;
       
    }
}
