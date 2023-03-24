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
    public static ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp = head;
        Map<Integer, Deque<ListNode>> map = new LinkedHashMap<>();
        int counter=1;
        while (temp!=null){
            for (int i = 0; i < counter; i++) {
                if(temp==null)
                    break;
                map.computeIfAbsent(counter,e->new ArrayDeque<>()).addLast(temp);
                temp=temp.next;
            }
            counter++;
        }
        temp=null;
        for (int i = 1; i <counter;  i++) {
            if(map.get(i).size()%2!=0 ){
                if(temp!=null)
                    temp.next=map.get(i).getFirst();
                temp= map.get(i).getLast();
            }
            else if(map.get(i).size()%2==0){
                int indexCounter=map.get(i).size();
                for (int j = 0; j <indexCounter; j++) {
                    temp.next=map.get(i).getLast();
                    temp=map.get(i).removeLast();
                }
            }
        }
        temp.next=null;
        return head;
    }
}