package Other;
//两数相加
public class Solution_3 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode temp=new ListNode(0);
        boolean flag=true;
        boolean flag2=false;
        while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val;
            ListNode listNode;
            //先判断有没有下面来的进位
            if(flag2){
                sum=sum+1;
            }
            //判断有没有向前面的进位
            if(sum>9){
                listNode=new ListNode(sum-10);
                flag2=true;
            }else{
                listNode=new ListNode(sum);
                flag2=false;
            }
            if(flag){
                head=listNode;
                flag=false;
            }
            temp.next=listNode;
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int sum=l1.val;
            ListNode listNode=new ListNode(0);
            //先判断有没有下面来的进位
            if(flag2){
                sum+=1;
            }
            //判断有没有向前面的进位
            if(sum>9){
                listNode=new ListNode(sum-10);
                flag2=true;
            }else{
                listNode=new ListNode(sum);
                flag2=false;
            }
            temp.next=listNode;
            temp=temp.next;
            l1=l1.next;
        }

        while(l2!=null){
            int sum=l2.val;
            ListNode listNode;
            //先判断有没有下面来的进位
            if(flag2){
                sum+=1;
            }
            //判断有没有向前面的进位
            if(sum>9){
                listNode=new ListNode(sum-10);
                flag2=true;
            }else{
                listNode=new ListNode(sum);
                flag2=false;
            }
            temp.next=listNode;
            temp=temp.next;
            l2=l2.next;
        }

        if(flag2){
            ListNode listNode=new ListNode(1);
            temp.next=listNode;
        }

        return head;
    }
}
