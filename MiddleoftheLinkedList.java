//Problem Description
/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.



Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
*/

public class MiddleoftheLinkedList {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);

        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        middleNode(n1);

    }
    public static ListNode middleNode(ListNode head) {
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

 class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }