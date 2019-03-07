import java.util.*;

public class arraySmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n = input.nextInt();

        double[] numbers = new double[n];
        
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.print(min(numbers));
    }
    public static double min(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
} 