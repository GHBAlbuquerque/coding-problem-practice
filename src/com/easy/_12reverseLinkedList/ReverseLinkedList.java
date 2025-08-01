package com.easy._12reverseLinkedList;

public class ReverseLinkedList {

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode reverselist(ListNode node) {
        // check if current node is the last, because this is going to be the new head
        if(node == null || node.next == null) {
            return node;
        }

        // Since this is not the last node, i want to recursively go though all the nodes until i find it
        // Then set as the head
        // If I use reverselist(node) then i'll be stuck forever in the same node, so it's node.next
        ListNode newHead = reverselist(node.next);

        // after i finally found the last one and start recursively going through the nodes
        // I have to set the next node of my next node as the current node
        node.next.next = node;

        //I also have to set the next node of the current node as null, so it breka sthe recursion the next time
        node.next = null;

        // finally i return the reversed list.
        return newHead;
    }


    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ReverseLinkedList.printList(ReverseLinkedList.reverselist(node1));

        ListNode node4 = ListNode.createList(new int[]{1, 2, 3, 4, 5});
        ReverseLinkedList.printList(ReverseLinkedList.reverselist(node4));  // Expected output: 5 4 3 2 1

        ListNode node5 = ListNode.createList(new int[]{1, 2});
        ReverseLinkedList.printList(ReverseLinkedList.reverselist(node5));  // Expected output: 2 1

        ListNode node6 = ListNode.createList(new int[]{});
        ReverseLinkedList.printList(ReverseLinkedList.reverselist(node6));  // Expected output: (empty)

        ListNode node7 = ListNode.createList(new int[]{10});
        ReverseLinkedList.printList(ReverseLinkedList.reverselist(node7));  // Expected output: 10

        ListNode node8 = ListNode.createList(new int[]{7, 14, 21});
        ReverseLinkedList.printList(ReverseLinkedList.reverselist(node8));  // Expected output: 21 14 7
    }
}