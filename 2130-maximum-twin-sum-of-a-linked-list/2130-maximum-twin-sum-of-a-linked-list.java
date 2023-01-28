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
    public int pairSum(ListNode head) {
        ListNode temp =head;
        List<Integer> list = new ArrayList<>();
        int totalSum=0;
        while (temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int size = list.size()-1;
        for (int i = 0; i < list.size(); i++) {
            if(totalSum<(list.get(i)+list.get(size-i))){
                totalSum=(list.get(i)+list.get(size-i));
            }
        }
        return totalSum;
    }
}