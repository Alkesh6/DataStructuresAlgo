package Stack;
import java.util.Stack;

public class StackLL {
    // public static class Node{
    //     int data;
    //     Node next;

    //     public Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // public static Node head;
    // //isEmpty
    // public static boolean isEmpty(){
    //     return head == null;
    // }
    // //Push
    // public static void push(int data){
    //     Node newNode = new Node(data);
    //     if(isEmpty()){
    //         head = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    //     return;
    // }
    // //Pop
    // public static int pop(){
    //     if (isEmpty()) {
    //         return -1;
    //     }
    //     int top = head.data;
    //     head = head.next;
    //     return top;
    // }

    // //Peek
    // public static int peek(){
    //     if (isEmpty()) {
    //         return -1;
    //     }
    //     return head.data;
    // }

    public static void pushatButtom(Stack<Integer> s,int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatButtom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushatButtom(s, top);
    }
    public static void main(String[] args) {
        // StackLL s1 = new StackLL();
        // s1.push(1);
        // s1.push(2);
        // s1.push(3);
        // while (!isEmpty()) {
        //     System.out.println(peek());
        //     pop();
        // }
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // pushatButtom(stack, 4);
        // while (!stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }
        // String str = "abc";
        // String result = reverseString(str);
        // System.out.println(result);
        
    }
    
}
