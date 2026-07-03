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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int rem;
        int carry=0;
        ListNode temp =new ListNode(0);
        ListNode prev=temp;
        while (l1!= null && l2!=null){
            sum=l1.val+l2.val +carry;
            carry=sum/10;
            prev.next=new ListNode(sum%10);
            prev=prev.next; 
            l1=l1.next;l2=l2.next;
        }
        while(l1!=null){
            sum=l1.val+carry;
            carry=sum/10;
            prev.next=new ListNode(sum%10);
            prev=prev.next; 
            l1=l1.next;
        }
        while(l2!=null){
            sum=l2.val+carry;
            carry=sum/10;
            prev.next=new ListNode(sum%10);
            prev=prev.next; 
            l2=l2.next;
        }
        if(carry>0){
            prev.next=new ListNode(carry);
        }
        return temp.next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        int carry = 0;

        // process both lists together
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            prev.next = new ListNode(sum % 10);
            prev = prev.next;
        }

        // handle leftover carry
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
