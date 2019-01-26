import java.util.*;

public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");

        char letter = input.nextLine().charAt(0);

        if (Character.toUpperCase(letter) == 'A' ||
            Character.toUpperCase(letter) == 'E')
            //
            //
            //
            System.out.print("Character is a vowel");
        else {
            System.out.print("Character is not a vowel");
            }
    }
}