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
    ListNode head;
    int totalNodes =0;
    public Solution(ListNode head) {
        ListNode temp=head;
        this.head=head;
        while (temp!=null){
            totalNodes++;
            temp=temp.next;
        }
    }

    public int getRandom() {
        int nodeNumber= (int)Math.ceil(Math.random()*this.totalNodes)-1;
        int tempNumb=0;
        ListNode temp =head;
        while(temp!=null){
            if(nodeNumber==tempNumb) return temp.val;
            
            tempNumb++;
            temp=temp.next;
        }
        return 0;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */