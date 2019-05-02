
// Java code to demonstrate empty() method 
import java.util.*; 
  
public class Stack_Demo { 
    public static void main(String[] args) 
    { 
  
        // Creating an empty Stack 
        Stack<String> STACK = new Stack<String>(); 
  
        // Stacking strings 
        STACK.push("Geeks"); 
        STACK.push("4"); 
        STACK.push("Geeks"); 
        STACK.push("Welcomes"); 
        STACK.push("You"); 
  
        // Displaying the Stack 
        System.out.println("The stack is: " + STACK); 
  
        // Checking for the emptiness of stack 
        System.out.println("Is the stack empty? " +  
                                      STACK.empty()); 
  
        // Popping out all the elements 
        STACK.pop(); 
        STACK.pop(); 
        STACK.pop(); 
        STACK.pop(); 
        STACK.pop(); 
  
        // Checking for the emptiness of stack 
        System.out.println("Is the stack empty? " +  
                                     STACK.empty()); 
    } 
} 
