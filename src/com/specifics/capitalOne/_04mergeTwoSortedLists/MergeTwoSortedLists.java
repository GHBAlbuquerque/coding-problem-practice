package com.specifics.capitalOne._04mergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createList(int[] values) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }
}

public class MergeTwoSortedLists {

    public static void printList(ListNode list) {
        String output = "[";

        while(list != null) {
            output+=list.val;
            output+=",";
            list = list.next;
        }

        System.out.println(output + "]");
    }

    public static ListNode mergeLists(ListNode root1, ListNode root2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(root1 != null && root2 != null) {
            if(root1.val <= root2.val) {
                current.next = root1;
                root1 = root1.next;
            } else {
                current.next = root2;
                root2 = root2.next;
            }

            current = current.next;
        }


        if(root1 != null) {
            current.next = root1;
        } else if (root2 != null) {
            current.next = root2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = ListNode.createList(new int[]{5,7,9});
        ListNode node2 = ListNode.createList(new int[]{4,8,10});

        com.easy._13mergeTwoSortedLists.MergeTwoSortedLists.printList(com.easy._13mergeTwoSortedLists.MergeTwoSortedLists.mergeLists(node1, node2));
    }
}