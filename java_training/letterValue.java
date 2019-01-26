/** 
 * This program implements an application that reads 
 * a letter A to F and print the numeric value 
 * for the grade.
 * 
 * @author Adnan Kivanc Corut
 */

import java.util.*;

public class letterValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Calling Scanner class to read input

        Map<String, Integer> d = new HashMap<String, Integer>(); // Creating an empty HashMap

        // Mapping integer values to string keys
        d.put("A", 4);
        d.put("B", 3);
        d.put("C", 2);
        d.put("D", 1);
        d.put("F", 0);

        
            System.out.print("Enter your letter grade (A to F): "); 
            String grade = input.nextLine();

            System.out.println("Your numeric grade is: " + d.get(grade.toUpperCase())); // Print the output
    }
}