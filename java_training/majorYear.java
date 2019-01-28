import java.util.*;
import java.io.*;

public class majorYear {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        int number;

        System.out.print("Enter your major and year: ");
        str = input.nextLine();
        number = input.nextInt();

        Map<String, String> major = new HashMap<String, String>();
        Map<Integer, String> year = new HashMap<Integer, String>();

        major.put("M", "Mathematics");
        major.put("C", "Computer Science");
        major.put("I", "Informatics");

        year.put(1, "Freshman");
        year.put(2, "Sophomore");
        year.put(3, "Junior");
        year.put(4, "Senior");

        System.out.print("Your major is " + major.get(str.toUpperCase()) + " and you are a " + year.get(number));
    }     
}