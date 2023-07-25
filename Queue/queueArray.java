package Queue;
public class queueArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Is Empty function
        public static boolean isEmpty(){
            return rear == -1;
        }

        // Add
        public static void add(int data){
            if (rear == size -1) {
                return;
            }
            rear = rear +1;
            arr[rear] = data;
        }

        //remove
        public static int remove(){
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            rear  = rear -1;
            return front;
        }

        //peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return arr[0];
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
