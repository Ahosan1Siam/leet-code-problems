public class LinkedList {
    public ListNode reverseLinkedList(ListNode head){
        ListNode previous= null;
        ListNode next = null;
        ListNode current =head;
        while (current!=null){
            // Store the next node in the list. We need to do this because we will change the current node's next pointer.
            next = current.next;

            // Reverse the link. Instead of pointing to the next node, the current node now points to the previous node.
            current.next = previous;

            // Move the previous pointer to the current node (since the current node is now processed).
            previous = current;

            // Move the current pointer to the next node (to continue processing the rest of the list).
            current = next;


        }

        return previous;
    }
}

