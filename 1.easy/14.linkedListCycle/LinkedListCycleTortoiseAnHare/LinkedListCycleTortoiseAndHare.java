import java.util.*;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode createCyclicList(List<Integer> values, int pos) {
        if (values == null || values.isEmpty()) return null;

        ListNode head = new ListNode(values.get(0));
        ListNode current = head;
        ListNode cycleEntry = null;

        for (int i = 1; i < values.size(); i++) {
            ListNode newNode = new ListNode(values.get(i));
            current.next = newNode;
            current = newNode;

            if (i == pos) {
                cycleEntry = newNode;
            }
        }

        // Handle if pos is 0 (first element is the cycle entry)
        if (pos == 0) {
            cycleEntry = head;
        }

        if (pos >= 0) {
            current.next = cycleEntry;
        }

        return head;
    }
}

public class LinkedListCycleTortoiseAndHare {

    public static void printResult(List list, boolean result) {
        String message = "The list's %s result for having a cycle is: %s\n";
        System.out.printf(message, list.toString(), result);
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head; // moves one by one
        ListNode fast = head.next; // moves two by two

        while(slow != null && fast != null && fast.next != null) {
            if(slow == fast) {
                System.out.printf("Nodes are equal again at %s\n", slow.val);
                return true;
            } else {
                System.out.printf("Nodes are different at %s and %s\n", slow.val, fast.val);
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<Integer> vals = Arrays.asList(3, 2, 0, -4);
        int pos = 1; // means tail connects to node with value 2 - true
        ListNode testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycleTortoiseAndHare.printResult(vals, LinkedListCycleTortoiseAndHare.hasCycle(testList));

        vals = Arrays.asList(1, 2);
        pos = 0; // means tail connects to node with value 1 - true
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycleTortoiseAndHare.printResult(vals, LinkedListCycleTortoiseAndHare.hasCycle(testList));

        vals = Arrays.asList(1);
        pos = -1; // no cycle, single element - false
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycleTortoiseAndHare.printResult(vals, LinkedListCycleTortoiseAndHare.hasCycle(testList));

        vals = Arrays.asList(1, 2, 3, 4, 5);
        pos = -1; // no cycle, multi-element - false
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycleTortoiseAndHare.printResult(vals, LinkedListCycleTortoiseAndHare.hasCycle(testList));

        vals = Arrays.asList(1);
        pos = 0; // single node pointing to itself - true
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycleTortoiseAndHare.printResult(vals, LinkedListCycleTortoiseAndHare.hasCycle(testList));

        System.out.printf("-------------------");
    }
}