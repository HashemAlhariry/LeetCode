/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         HashMap<Integer,ListNode> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
           if(map.containsKey(System.identityHashCode(temp))){
               return map.get(System.identityHashCode(temp));
           }else{
               map.put(System.identityHashCode(temp),temp);
               temp=temp.next;
           }
        }
        return null;
    }
}