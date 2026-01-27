public class Leetcode_2 {
    class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3= new ListNode(0);
        int sum= 0;
        int carry= 0;
        ListNode curr= l3;
        while(l1 != null || l2 != null || carry != 0){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            
            sum = v1 + v2 + carry;
            carry = sum/10;

            curr.next= new ListNode(sum%10);
            curr= curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return l3.next;
    }
}
}
