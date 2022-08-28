//Problem Description
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz


Follow up: Could you do this in one pass?

*/

import java.util.ArrayList;
import java.util.List;

class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {


       // ListNode l5=new ListNode(5);
       // ListNode l4=new ListNode(4,l5);
       // ListNode l3=new ListNode(3,l4);
        ListNode l2=new ListNode(2);
        ListNode l1=new ListNode(1,l2);
        removeNthFromEnd(l1,1);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        while (head!=null){
            list.add(head);
            head=head.next;
        }
        if(list.size()==1)
            return null;
        if(list.size()==2){
            if(n==1){
                list.get(0).next=null;
                return list.get(0);
            }
            else{
                return list.get(1);
            }
        }

        if(n!=list.size()){
            ListNode node = list.get(list.size()-n-1);

            if(list.size()-n-1 < list.size() &&  list.size()-n+1< list.size() ){
                node.next=list.get(list.size()-n+1);
            }else{
                node.next=null;
            }
            return list.get(0);
        }else{
            return list.get(1);
        }

    }

     public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  }
}









