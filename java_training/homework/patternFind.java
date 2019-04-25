/**
 * @author Adnan Kivanc Corut
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence: "); 
        String seq1 = input.nextLine();

        System.out.print("Enter another sequence: "); 
        String seq2 = input.nextLine();

        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher("");

        for (int i= 0; i < seq1.length()-2; i++) {
            pattern = Pattern.compile(seq1.substring(i, i+3));
            matcher = pattern.matcher(seq2); 
            
            while(matcher.find()) {
                System.out.println("Matching pattern: " + matcher.group());
            }
        }
    }
}