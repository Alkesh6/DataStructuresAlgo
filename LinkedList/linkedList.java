public class linkedList{
    public static class Node{
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
        //Step 1 - creation of a new node
        Node newNode = new Node(data);
        size++;
        // if LL is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2 - newNode.next = head
        newNode.next = head;
        // Step 3 - head = newNode
        head = newNode;
    }

    // Add at the last
    public void addLast(int data){
        // Step 1 - creation of new node
        Node newNodeL = new Node(data);
        size++;
        // If LL is empty
        if(tail == null){
            head = tail = newNodeL;
            return;
        }
        // Step 2 - tail = newNode
        tail.next = newNodeL;
        // Step 3 tail = newNode
        tail = newNodeL;
    }

    // Printing Linked list
    public void print(){
        if (head == null) {
            System.out.println("Linked list is empty");
        }

        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // insert at given index
    public void add(int index,int data){
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove head
    public int removeFirst(){
        if (size == 0) {
            System.out.println("The linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size == 0) {
            System.out.println("The linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // temp = i - 2(Second last element)
        Node prev = head;
        for(int i = 0 ;i < size - 2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp.next != null){
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // if key not found
        return -1;
    }

    public int helper(Node head,int key){
        // BASE Condition
        if(head == null) {
            return -1;
        }
        // Key found
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
                }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;   // delete first
        }

        int i = 1;
        int nthPos = sz-n;
        Node prev = head;
        while(i < nthPos){
            prev = prev.next;
            prev.next = prev.next.next;
            return;
        }
    }
    
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        // l1.head = new Node(1);
        // l1.head.next = new Node(2);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.add(2,5);
        // l1.removeFirst();
        // l1.addFirst(1);
        // l1.removeLast();
        // l1.addLast(4);
        l1.print();
        System.out.println(size);
        l1.deleteNthFromEnd(3);
        l1.print();
        // l1.reverse();
        // l1.print();
        // System.out.println(l1.recSearch(5));
        // System.out.println(l1.recSearch(10));

    }
}