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

public class Solution {
    public static int findIntersection(Node headA, Node headB) {
        //Write your code here
        if(headA == null || headB == null) return 0;

        Node a = headA;
        Node b = headB;

        while(a!=b){
            a= a ==null? headB:a.next;
            b=b==null? headA:b.next;
        }

        return a.data;
    }
}
