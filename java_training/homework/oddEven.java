/** 
 * This program implements an application that reads 
 * the integer from user input, determines if a number 
 * is odd or even and Prints the output on the screen. 
 * 
 * @author Adnan Kivanc Corut
 */

import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Calling Scanner class to read input
        
        System.out.print("Enter a number: "); // Display the string for user input
        int number = input.nextInt(); // Numerical data input 

        if (number % 2 == 0 && number != 0) {      // Determines if the numbers is odd or even.
            System.out.print("The number is even "); // Display the string if the number is even
        
        }else if (number == 0) {  // Check if user input is zero.
            System.out.print("Zero is neither an even nor an odd number."); // Display the string 

        }else {
            System.out.print("The number is odd "); // Display the string if the number is odd
        }
    }
}