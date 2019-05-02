
// Java code to illustrate contains() 
import java.io.*; 
import java.util.HashSet; 
  
public class HashSetDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> set = new HashSet<String>(); 
  
        // Use add() method to add elements into the Set 
        set.add("Welcome"); 
        set.add("To"); 
        set.add("Geeks"); 
        set.add("4"); 
        set.add("Geeks"); 
  
        // Displaying the HashSet 
        System.out.println("HashSet: " + set); 
  
        // Check for the empty set 
        System.out.println("Is the set empty: " + set.isEmpty()); 
  
        // Clearing the set using clear() method 
        set.clear(); 
  
        // Again Checking for the empty set 
        System.out.println("Is the set empty: " + set.isEmpty()); 
    } 
} 
