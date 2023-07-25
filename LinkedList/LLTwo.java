import java.util.*;
import java.util.LinkedList;

public class LLTwo {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }        
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle
        prev.next = null;
    }

    public static Node mid(){
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        return mid;
    }

    public Node merge(Node left,Node right) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (left!=null && right!=null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left!= null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if (head == null || head.next == null){
            return head;
        }
        // get middle
        Node middle = mid();
        // left and right half
        Node rightHalf = middle.next;
        middle.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHalf);
        //Merge
        return merge(newLeft, newRight);

    }


    public static void main(String[] args) {
        LLTwo l1 = new LLTwo();
        head = l1.new Node(1);
        Node temp = l1.new Node(2);
        head.next = temp;
        head.next.next = l1.new Node(3);
        head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        // l1.addFirst(1);
        // l1.addFirst(2);
        // l1.addFirst(3);
        // l1.addFirst(4);
        // l1.addFirst(5);


        // l1.print();
        // l1.head = l1.mergeSort(l1.head);
        // System.out.print("\n Sorted Linked List is: \n");
        // l1.print();

        
    }
    
}
