// java program print Maximum and Minmum Value of a 
// sorted List, List may be increasing or decreasing order 
import java.util.ArrayList; 
import java.util.List; 
public class FindFirstLast { 
    // function find and print Maximum and Minmum value 
    public static void getFirstLat(List<Integer> list) 
    { 
  
        // Displaying ArrayList elements 
        System.out.println("ArrayList contains: " + list); 
  
        // Logic to get the last element from ArrayList 
        if (list != null && !list.isEmpty()) { 
            if (list.get(0) < list.get(list.size() - 1)) { 
  
                // if list in increasing order 
                System.out.println("Minimum Value: "
                                   + list.get(0)); 
                System.out.println("Maximum Value: "
                           + list.get(list.size() - 1)); 
                return; 
            } 
  
            else { 
  
                // if list in decreasing order 
                System.out.println("Minimum Value: "
                            + list.get(list.size() - 1)); 
                System.out.println("Maximum Value: "
                                   + list.get(0)); 
                return; 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        /* Creating ArrayList of Integer and adding 
            elements to it */
        List<Integer> al = new ArrayList<Integer>(); 
        al.add(5); 
        al.add(4); 
        al.add(3); 
        al.add(2); 
        al.add(1); 
  
        getFirstLat(al); 
    } 
} 