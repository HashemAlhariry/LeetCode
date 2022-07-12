//Problem Description
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */

public class MergeTwoSortedLists {

    public static void main(String args[]){

    }

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
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

