//Problem
/*

*/

class MergekSortedLists {

    public static void main(String[] args) {

        ListNode n5=new ListNode(5);
        ListNode n4=new ListNode(4,n5);
        ListNode n1=new ListNode(1,n4);


        ListNode n44=new ListNode(4);
        ListNode n3=new ListNode(3,n44);
        ListNode n11=new ListNode(1,n3);

        ListNode n6=new ListNode(6);
        ListNode n222=new ListNode(2,n6);


        ListNode [] arr = new ListNode[3];
        arr[0]=n1;
        arr[1]=n11;
        arr[2]=n222;

        mergeKLists(arr);

    }

    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode node = new ListNode();
        ListNode head = node;
        boolean checker=true;

        while (checker){
            int counter=0;
            for (int i = 0; i <lists.length ; i++) {
               if(lists[i]==null)
                   counter++;
            }


            if(counter==lists.length){
                checker=false;
                head=head.next;
            }

            if(!checker)
                break;

            node.next = new ListNode();
            node=node.next;

            ListNode tempList=null;
            int temp=1001;
            int index=-1;
            for (int i = 0; i <lists.length ; i++) {
                if(lists[i]!=null && temp>lists[i].val){
                    temp=lists[i].val;
                    tempList=lists[i];
                    index=i;
                }
            }
            if(tempList!=null) {
                node.val = tempList.val;
                lists[index]=lists[index].next;
            }

        }

        return head;
    }

    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }

   }


}







