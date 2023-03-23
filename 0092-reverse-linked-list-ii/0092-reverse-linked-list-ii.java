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
      public ListNode reverseBetween(ListNode head, int left, int right) {
        Queue<ListNode> queue = new LinkedList<>();
        Stack<ListNode> stack = new Stack<>();
        int leftCounter=1;
        ListNode root = head;
        while (root!=null){
            if(leftCounter<left){
                queue.add(root);
            } else if (left<=leftCounter && leftCounter<=right) {
                stack.add(root);
            }else {
                queue.add(root);
            }
            leftCounter++;
            root=root.next;
        }
        ListNode result;
        ListNode temp;
        if(left==1){
            result=stack.pop();
            temp=result;
            while(!stack.isEmpty()){
               temp.next=stack.pop();
               temp=temp.next;
            }
            while (!queue.isEmpty()){
                temp.next=queue.poll();
                temp=temp.next;
            }
        }else {
            int counter=2;
            result=queue.poll();
            temp=result;
            while (counter<left ){
                temp.next=queue.poll();
                temp=temp.next;
                counter++;
            }
            while (!stack.isEmpty()){
                temp.next=stack.pop();
                temp=temp.next;
            }
            while (!queue.isEmpty()){
                temp.next=queue.poll();
                temp=temp.next;
            }
        }
        temp.next=null;
        return result;
    }
}