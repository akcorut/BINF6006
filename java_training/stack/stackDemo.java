import java.util.*;

public class stackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("Java");
        st.push("source");
        st.push("code");

    // remove from top
    System.out.println(st.pop());
    System.out.println(st.peek());

    String test = "Stack";
    for (int i=test.length(); i >= 1; i--)
        System.out.print(st.push(test.charAt(i-1)));
    }

    class stack {
        int max = 100;
        int top;
        int a[] = new int[max];
        stack() {
            top = -1;
        }
        boolean isEmpty() {
            return 
        }
    }
}

