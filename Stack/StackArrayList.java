package Stack;
import java.util.ArrayList;

public class StackArrayList {
    static class stack{
        static ArrayList<Integer> s1 = new ArrayList<Integer>();
        //isEmpty
        public static boolean isEmpty(){
            return s1.size() == 0;
        }

        // push
        public static void push(int data){
            s1.add(data);
        }

        //pop
        public static int pop(int data){
            int top = s1.size()-1;
            s1.remove(s1.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            return s1.size()-1;
        }
    }
    public static void main(String[] args) {
        stack a1 = new stack();
        a1.push(1);
        a1.push(2);
        a1.push(3);
               
    }
    
}
