package recursiondemo;
//两两交换链表中的节点
public class Solution {

    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head.next.next;
        ListNode temp2=head.next;
        head.next.next=head;
        head.next=swapPairs(temp);
        return temp2;
    }
}
