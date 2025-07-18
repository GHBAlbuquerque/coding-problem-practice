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


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. the nodes I receive are the iterators for each of my lists

        // 4. To create the new list, i need a node to be the head, that is returned in the end
        ListNode newHead = new ListNode(-1);
        ListNode current = newHead; // 5. but also need to traverse my list. current is used to traverse node by node, checking values


        // 2. I want to iterate over each list until I reach the end of any of them
        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) { //3. i need to check which one is the smallest number
                current.next = list2; // 6. the smallest value is set on my current.next
                list2 = list2.next; // 7. the list advances
            } else {
                current.next = list1;
                list1 = list1.next;
            }

            current = current.next; // 8. after changing next, i advance to the next node
        }

        if(list1 != null) current.next = list1; // by the end, one of the lists might not have been completed. so i add it manually
        if(list2 != null) current.next = list2;

        return newHead.next;

    }

    public static void main(String[] args) {
        ListNode node1 = ListNode.createList(new int[]{5,7,9});
        ListNode node2 = ListNode.createList(new int[]{4,8,10});

        MergeTwoSortedLists.printList(MergeTwoSortedLists.mergeTwoLists(node1, node2));
    }
}