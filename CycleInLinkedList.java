public class CycleInLinkedList {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode first = head;
        while (first!=null && first.next !=null){
            slow = slow.next;
            first = first.next.next;
            if(slow == first){
                return  true;
            }
        }
        return false;
    }
}
