import java.util.*;
import java.io.*;

public class stringLen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Length of your string is " +str.length()+ 
        " and the first character is " +str.charAt(0));

    }
}