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
class Solution {
    public boolean isPalindrome(ListNode head) {
            boolean result = true;
        ListNode slowPointer = head;
        ListNode fastPointer= head;

        while (fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        if(fastPointer!=null)
            slowPointer=slowPointer.next;
        slowPointer=reverseLinkedList(slowPointer);

        while(slowPointer!=null){
             if(slowPointer.val==head.val) {
                slowPointer=slowPointer.next;
                head=head.next;
                continue;
            }

            return false;
        }

        return result;
    }
    public static ListNode reverseLinkedList(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;

        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}