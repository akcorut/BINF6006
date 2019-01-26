import java.util.Scanner;

public class ifTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.print("HiFive");
        if (number % 2 == 0) {
            System.out.print("HiEven");
        }
        }
    }
}