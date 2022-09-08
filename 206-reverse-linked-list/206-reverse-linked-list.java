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
    public ListNode reverseList(ListNode head) {
         List<Integer> values = new ArrayList<>();
        ListNode temp = head;
        ListNode temp2= head;
        if(head==null)
            return head;

        
        while(temp!=null){
            values.add(temp.val);
            temp=temp.next;
        }
        int index=values.size()-1;
        while(temp2!=null){
            temp2.val=values.get(index);
            index--;
            temp2=temp2.next;
        }
        return head;
    }
}