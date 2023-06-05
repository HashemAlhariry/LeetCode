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
      public  ListNode sortList(ListNode head) {
           if(head==null)
              return null;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        while (head!=null){
            pq.add(head.val);
            head=head.next;
        }
        ListNode newHead= new ListNode();
        ListNode temp=newHead;
        ListNode prev=temp;
        while (!pq.isEmpty()){
            temp.val= pq.poll();
            temp.next=new ListNode();
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return newHead;
    }
}