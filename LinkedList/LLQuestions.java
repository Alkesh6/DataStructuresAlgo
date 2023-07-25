public class LLQuestions {
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        LLQuestions l2 = new LLQuestions();
        l2.addFirst(1);
        l2.addFirst(2);
        l2.addFirst(3);
        l2.addFirst(4);
        l2.addFirst(5);
        l2.addFirst(6);

        System.out.println("Middle element is :");
        System.out.println((size/2)+1);
    }
}
