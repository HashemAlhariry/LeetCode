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
  public ListNode deleteDuplicates(ListNode head) {
       if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode temp = head;
        while (temp!=null){
            ListNode currentNode = temp;
            temp=temp.next;
            while (temp!=null && currentNode.val==temp.val){
                temp=temp.next;
            }
            currentNode.next=temp;
        }

        return head;
    }
}