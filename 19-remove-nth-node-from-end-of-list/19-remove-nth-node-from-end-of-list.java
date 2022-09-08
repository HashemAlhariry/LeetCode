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
    public ListNode removeNthFromEnd(ListNode head, int n) {
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
}