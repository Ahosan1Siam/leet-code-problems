package nthElementOfLinkedList;

public class NthElementOfLinkedList {
    int data;
    NthElementOfLinkedList next;

    NthElementOfLinkedList(int x){
        this.data = x;
        this.next = null;
    }
}

class GfG{
    static int GetNth(NthElementOfLinkedList head, int index) {
        if (head == null) return -1;
        // if index equal to 1 return node.data
        if (index == 1) return head.data;
        // recursively decrease n and increase
        // head to next pointer
        return GetNth(head.next, index - 1);
    }

    public static void main(String args[]){
        NthElementOfLinkedList head = new NthElementOfLinkedList(1);
        head.next = new NthElementOfLinkedList(2);
        head.next.next = new NthElementOfLinkedList(3);
        head.next.next.next = new NthElementOfLinkedList(4);
        head.next.next.next.next = new NthElementOfLinkedList(5);

        System.out.printf("Element at index 3 is %d",GetNth(head,3));
    }
}
