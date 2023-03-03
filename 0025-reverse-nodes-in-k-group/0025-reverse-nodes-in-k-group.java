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
    public ListNode reverseKGroup(ListNode head, int k) {
                Stack<ListNode> stack = new Stack<>();
        List<ListNode> list = new ArrayList<>();
        int counter=0;
        while (head!=null){
            counter=0;
            ListNode temp = head;
            while(counter<k && head!=null){
                stack.push(head);
                head=head.next;
                counter++;
            }
            if(counter==k){
                while (!stack.isEmpty()){
                    list.add(stack.pop());
                }
            }else{
                while (temp!=null){
                    list.add(temp);
                    temp=temp.next;
                }
            }
        }

        for (int i =0; i <list.size()-1 ; i++) {
            list.get(i).next=list.get(i+1);
        }
        list.get(list.size()-1).next=null;
        return list.get(0);
    }
}