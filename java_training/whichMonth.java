/** 
 * This program implements an application that reads 
 * the integer from user input and displays month names 
 * in English accordingly.
 * 
 * @author Adnan Kivanc Corut
 */

import java.util.*;

public class whichMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Calling Scanner class to read input

        Map<Integer, String> d = new HashMap<Integer, String>(); // Creating an empty HashMap

        // Mapping string values to integer keys
        d.put(1, "January");
        d.put(2, "February");
        d.put(3, "March");
        d.put(4, "April");
        d.put(5, "May");
        d.put(6, "June");
        d.put(7, "July");
        d.put(8, "August");
        d.put(9, "September");
        d.put(10, "October");
        d.put(11, "November");
        d.put(12, "December");

        // Exit when the input is valid (between 1 and 12)
        while (true) { 
            System.out.print("Enter a number between 1 and 12: "); // Display the string for user input
            int number = input.nextInt();  // Numerical data input

            if (number < 12 && number > 0) { // Check the data input if it is valid 
            System.out.println("Month: " + d.get(number)); // Print the output
            break;

            }else {
            System.out.println("Please enter a correct number!"); // Display the string if the input is not valid
            }
        }
    }
}