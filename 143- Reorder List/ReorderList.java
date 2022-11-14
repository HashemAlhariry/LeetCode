//Problem
/*

*/


import java.util.*;

class ReorderList {
    public static void main(String[] args) {

        ListNode n5 = new ListNode();
        n5.val=5;

        ListNode n4 = new ListNode();
        n4.val=4;
        n4.next=n5;

        ListNode n3 = new ListNode();
        n3.val=3;
        n3.next=n4;

        ListNode n2= new ListNode();
        n2.val=2;
        n2.next=n3;
        ListNode n1 = new ListNode();
        n1.val=1;
        n1.next=n2;

        reorderList(n1);

    }

    public  static void reorderList(ListNode head) {

        Queue<Integer> queue= new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        int counter=0;
        ListNode temp = head;
        ListNode temp2 =head;
        ListNode temp3 =head;
        while (temp!=null){
            counter++;
            temp= temp.next;
        }
        int firstList;

        if(counter%2!=0)
            firstList=counter/2 +1;
        else
            firstList=counter/2;

        for (int i = 0; i <counter ; i++) {
            if(i<firstList)
                queue.add(temp2.val);
            else
                stack.add(temp2.val);

            temp2=temp2.next;
        }


        for (int i = 0; i <counter ; i++) {
            if(i%2!=0){
                temp3.val = stack.pop();
            }
            else {
                temp3.val=queue.poll();
            }
            temp3=temp3.next;
        }
    }


    public static class ListNode {
           int val;
           ListNode next;
           ListNode() {}
           ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
}







