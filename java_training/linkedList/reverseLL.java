
// Java program for reversing an arraylist without 
// using any additional space 
import java.util.*; 
  
public class LinkedListTest2 { 
    public static void main(String[] args) 
    { 
        // Declaring linkedlist without any initial size 
        LinkedList<Integer> linkedli = new LinkedList<Integer>(); 
  
        // Appending elements at the end of the list 
        linkedli.add(new Integer(1)); 
        linkedli.add(new Integer(2)); 
        linkedli.add(new Integer(3)); 
        linkedli.add(new Integer(4)); 
        linkedli.add(new Integer(5)); 
        System.out.print("Elements before reversing: " + linkedli); 
  
        // Calling user defined function for reversing 
        linkedli = reverseLinkedList(linkedli); 
        System.out.print("\nElements after reversing: " + linkedli); 
    } 
  
    // Takes a linkedlist as a parameter and returns a reversed linkedlist 
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist) 
    { 
        for (int i = 0; i < llist.size() / 2; i++) { 
            Integer temp = llist.get(i); 
            llist.set(i, llist.get(llist.size() - i - 1)); 
            llist.set(llist.size() - i - 1, temp); 
        } 
  
        // Return the reversed arraylist 
        return llist; 
    } 
} 
