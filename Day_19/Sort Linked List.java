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
import java.util.*;
public class Solution {
    public static Node sortList(Node head) {
        //Write your code here
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        count = 0;
        while(temp!=null){
            arr[count++] = temp.data;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        count = 0;
        while(temp!=null){
            temp.data = arr[count++];
            temp = temp.next;
        }
        return head;
    }
}
