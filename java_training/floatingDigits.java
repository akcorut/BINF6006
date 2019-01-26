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
        
        System.out.print("Enter a float number: ");
        double number = input.nextDouble();

        String str_temp = new Double(number).toString();
        String str = str_temp.substring(0,str_temp.indexOf('.'));
        int digits = str.length();
        
        System.out.print(digits);
    }
}