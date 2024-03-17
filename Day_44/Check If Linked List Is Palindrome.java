import java.util.Stack;

// class Node {
//     public int data;
//     public Node next;

//     Node() {
//         this.data = 0;
//         this.next = null;
//     }

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }

//     Node(int data, Node next) {
//         this.data = data;
//         this.next = next;
//     }
// }

public class Solution {
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Stack<Integer> stack = new Stack<>();
        Node slow = head;
        Node fast = head;

        // Push the first half of the elements onto the stack
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the length of the linked list is odd, skip the middle element
        if (fast != null)
            slow = slow.next;

        // Compare the second half of the linked list with the elements in the stack
        while (slow != null) {
            if (stack.isEmpty() || stack.pop() != slow.data)
                return false;
            slow = slow.next;
        }

        return true;
    }
}
