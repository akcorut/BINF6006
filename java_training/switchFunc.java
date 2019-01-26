import java.util.*;

public class switchFunc {
	public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch(number & 12) {
            case 1: System.out.print("Monkey"); break;
            case 2: System.out.print(""); break;
        }
    }
}