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

public class LinkedListCycle {

    public static void printResult(List list, boolean result) {
        String message = "The list's %s result for having a cycle is: %s\n";
        System.out.printf(message, list.toString(), result);
    }

    public static boolean hasCycle(ListNode head) {
        // 1. I might have nodes with the same value on the linkedlist, but they're different objects.
        // what i'm looking for is the >object< node that creates the cycle
        // 2. I have to keep track of the nodes I see
        Set<ListNode> seen = new HashSet<>();

        // 3. Since I don't know if I have an end, I have to use while
        while(head != null) {
            if(seen.contains(head)) { // 4. check if I have already seen this node
                System.out.printf("Contains head %s\n", head.val);
                return true; // 5. If I have, then it is the start of my cycle
            } else {
                System.out.printf("Does not contain head %s\n", head.val);
                seen.add(head); //5. if I haven't, add to seen
                head = head.next; //6. head receives next
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<Integer> vals = Arrays.asList(3, 2, 0, -4);
        int pos = 1; // means tail connects to node with value 2 - true
        ListNode testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycle.printResult(vals, LinkedListCycle.hasCycle(testList));

        vals = Arrays.asList(1, 2);
        pos = 0; // means tail connects to node with value 1 - true
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycle.printResult(vals, LinkedListCycle.hasCycle(testList));

        vals = Arrays.asList(1);
        pos = -1; // no cycle, single element - false
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycle.printResult(vals, LinkedListCycle.hasCycle(testList));

        vals = Arrays.asList(1, 2, 3, 4, 5);
        pos = -1; // no cycle, multi-element - false
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycle.printResult(vals, LinkedListCycle.hasCycle(testList));

        vals = Arrays.asList(1);
        pos = 0; // single node pointing to itself - true
        testList = ListNode.createCyclicList(vals, pos);
        LinkedListCycle.printResult(vals, LinkedListCycle.hasCycle(testList));

        System.out.printf("-------------------");
    }
}