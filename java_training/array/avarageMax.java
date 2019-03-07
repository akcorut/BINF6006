import java.util.*;

public class avarageMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n;
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for(int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double avarage = sum / n;
        
        int count = 0;
        for (int i = 0; i < n; i++) 
            if (numbers[i] > avarage) {

            }

    }
}