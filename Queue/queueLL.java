package Queue;

public class queueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void insert(int data){
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public static int remove(){
            if (head == null) {
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            }
            else{
              head = head.next;
            }
            return front;
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q2 = new Queue();
        q2.insert(1);
        q2.insert(2);
        q2.insert(3);
        q2.insert(4);
        while(!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
    
}
