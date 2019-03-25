import java.io.*;

public class fibb {
    public static void main(String[] args) {
        System.out.print(fibonacci(6));
    }
    public static double fibonacci(double n) {
        if (n == 0) 
            return 0;
        if (n == 1) 
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}