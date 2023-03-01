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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        List<ListNode> l1 = new ArrayList<>();
        List<ListNode> l2 = new ArrayList<>();
        int counter=0;
        while (head!=null){
            if(counter%2==0){
                l1.add(head);
                head=head.next;
                counter++;
            }else {
                l2.add(head);
                head=head.next;
                counter++;
            }
        }

        if(l2.size()!=0) {
            head = l2.get(0);
        }
        else {
            head = l1.get(0);
            return head;
        }
        counter=0;
        while (counter<l2.size()){
              l2.get(counter).next=l1.get(counter);
              if(l2.size()>counter+1)
              l1.get(counter).next=l2.get(counter+1);

            counter++;
        }
     if(l2.size()!=l1.size())
        l1.get(l1.size()-2).next=l1.get(l1.size()-1);
     else
         l1.get(l1.size()-1).next=null;

        return head;
    }
}