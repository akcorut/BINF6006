/** 
 * This program implements an application that 
 * reads a floating-pointnumber from keyboard 
 * and finds number of digits before point.
 * 
 * @author Adnan Kivanc Corut
 */

import java.util.*;
import java.io.*;

public class floatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a floating-point number: ");
        double number = input.nextDouble();

        String str_temp = String.format("%f", number); // Convert double to String
        String str = str_temp.substring(0,str_temp.indexOf('.')); // Get substring before point
        int digits = str.length();
        
        System.out.print(digits);
    }
}