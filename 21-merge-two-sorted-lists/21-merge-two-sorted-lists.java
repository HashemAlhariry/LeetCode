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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode restList=head;
        boolean checkEmptyList = true;
        while (list1!=null || list2!=null){
            checkEmptyList=false;
            if(list1!= null && list2!=null){
                if(list1.val<= list2.val){
                    restList.val=list1.val;
                    list1=list1.next;
                }else {
                    restList.val = list2.val;
                    list2=list2.next;
                }


            }
            else if (list1 != null){
                restList.val=list1.val;
                list1=list1.next;

            }else if(list2 !=null){
                restList.val=list2.val;
                list2=list2.next;
            }

            if(list1 != null ||  list2 != null){
                restList.next= new ListNode();
                restList=restList.next;
            }


        }
        if(checkEmptyList)
            return null;
        return head;
    }
}