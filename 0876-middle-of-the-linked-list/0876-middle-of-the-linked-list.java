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
public ListNode middleNode(ListNode head) {
        ListNode slowPointer=head;
        ListNode fastPointer=head;

 
        while (fastPointer!=null){
          
            fastPointer=fastPointer.next;
                      
            if(fastPointer!=null)
                slowPointer=slowPointer.next;
            if(fastPointer!=null)
                fastPointer=fastPointer.next;
  
        }
        return slowPointer;
    }
}