package com.easy._12reverseLinkedList;

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

       MergeTwoSortedLists.printList(MergeTwoSortedLists.mergeLists(node1, node2));
    }
}