package com.medium._18addTwoNumbers;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry > 0) {
            int val1 = l1 != null? l1.val : 0;
            int val2 = l2 != null? l2.val : 0;
            int result = val1 + val2 + carry;

            // result / 10 = carry
            carry = result/10;
            int nodeval = result % 10;
            current.val = nodeval;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            if(l1 != null || l2 != null || carry > 0) {
                current.next = new ListNode(0);
                current = current.next;
            }

        }

        return dummy;
    }
}
