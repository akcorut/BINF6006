import java.util.*;

public class numberSort {
    public static void main(String[] args) {
        String[] data = {"Hi", "yes", "test", "welcome"};
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};

        System.out.println("Search result is"+Arrays.binarySearch(numbers, 3.4));
        Arrays.parallelSort(numbers);
        Arrays.sort(data);

        System.out.println("Results for Array numbers is "+Arrays.toString(numbers));
        System.out.println("Results for Array data is "+Arrays.toString(data));
    }
}