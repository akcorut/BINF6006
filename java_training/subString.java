/** 
 * This program implements an application that 
 * reads two strings from keyboard and check if the 
 * second string is a substring of first string.
 * 
 * @author Adnan Kivanc Corut
 */

import java.util.*;
import java.io.*;

public class subString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: "); 
        String word1 = input.nextLine();

        System.out.print("Enter another word: "); 
        String word2 = input.nextLine();

        if (word1.toLowerCase().contains(word2.toLowerCase())) {
            System.out.print("Second word is a subtring of the first word.");
            
        }else {
            System.out.print("Second word is not a subtring of the first word.");
        }
    }
}