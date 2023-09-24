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
   public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)
            return head;
        ListNode temp = head;
        ListNode nextTemp= head.next;
        while (nextTemp!=null){
            int val = gcdByBruteForceE(temp.val,nextTemp.val);
            ListNode node = new ListNode(val);
            temp.next=node;
            node.next=nextTemp;

            temp=nextTemp;
            nextTemp=nextTemp.next;
        }

        return head;
    }
    private static int gcdByBruteForceE(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}