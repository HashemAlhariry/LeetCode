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
    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode node = new ListNode();
        ListNode head = node;
        boolean checker=true;

        while (checker){
            int counter=0;
            for (int i = 0; i <lists.length ; i++) {
               if(lists[i]==null)
                   counter++;
            }


            if(counter==lists.length){
                checker=false;
                head=head.next;
            }
             
            if(!checker)
                break;

            node.next = new ListNode();
            node=node.next;
            
            ListNode tempList=null;
            int temp=1001;
            int index=-1;
            for (int i = 0; i <lists.length ; i++) {
                if(lists[i]!=null && temp>lists[i].val){
                    temp=lists[i].val;
                    tempList=lists[i];
                    index=i;
                }
            }
            if(tempList!=null) {
                node.val = tempList.val;
                lists[index]=lists[index].next;
            }

        }

        return head;
    }
}