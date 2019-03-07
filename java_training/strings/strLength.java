import java.util.*;

public class strLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        System.out.println("The length of the string is: " + s1.length() + " The first character of the string is: " + s1.charAt(0));
    }
}