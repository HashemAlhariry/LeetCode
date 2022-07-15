//Problem Description
/*
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
*/

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
 
    public static ListNode reverseList(ListNode head) {
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

class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
