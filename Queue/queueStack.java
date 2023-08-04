package Queue;
import java.util.*;

public class queueStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }


    }

    public static void main(String[] args) {
            Queue q3 = new Queue();
            q3.add(1);
            q3.add(2);
            q3.add(3);
            q3.add(4);
            while (!q3.isEmpty()) {
                System.out.println(q3.peek());
                q3.remove();
            }

    }
    
}
