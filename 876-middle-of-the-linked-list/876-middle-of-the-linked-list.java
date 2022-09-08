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
           int index=0;//size of linked list;
        ListNode temp = head;
        while(temp!=null){
            index++;
            temp=temp.next;
        }
        

        int middle;
        ListNode temp2=head;
         middle=index/2+1;
      

        int tempCounter=0;

        while(temp2!=null){

            if(tempCounter==middle-1){
                head=temp2;
                break;
            }
            tempCounter++;
            temp2=temp2.next;
        }

        return head;

    }
}