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
    public  ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null)
            return head;
        ListNode temp = head;
        ListNode nextTemp= head.next;
        while (nextTemp!=null){
            int val = gcdByBruteForce(temp.val,nextTemp.val);
            ListNode node = new ListNode(val);
            temp.next=node;
            node.next=nextTemp;
            
            temp=nextTemp;
            nextTemp=nextTemp.next;
        }
        
        return head;
    }
    public  int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

}