/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLinkedList {

    // iterative version
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode newL = null;
        ListNode curr = head;
        while(curr != null) {
          temp = newL;
          newL = curr;
          curr = curr.next;
          newL.next = temp;
        }
        return newL;
    }

    // recursive
    public ListNode reverseList(ListNode head) {
       return rev(head, null);
    }

    private ListNode rev(ListNode node, ListNode prev){
        if(node == null) {
            return prev;
        }
        ListNode temp = node.next;
        node.next = prev;
        return rev(temp, node);
    }
}
