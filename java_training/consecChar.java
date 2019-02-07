import java.util.*;

public class consecChar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String str = input.nextLine();

        int sum = 0;
        for (int i=0; i < str.length()-1; i++)
            if (str.charAt(i) == str.charAt(i + 1))
                sum++;

        System.out.print(sum);
        input.close();
    }
}