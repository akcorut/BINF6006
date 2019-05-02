import java.util.*; 
import java.lang.*;

public class recursiveFinal {
    public static int recurSum(int n) 
    { 
        if (n <= 1) 
            return n; 
        return n + recurSum(n - 1); 
    }
    public static void main(String args[]) 
    { 
        int n = 6;
        int n1 = 10; 
        int n2 = 12;
        int n3 = 20;
        System.out.println(recurSum(n));
        System.out.println(recurSum(n1));
        System.out.println(recurSum(n2)); 
        System.out.println(recurSum(n3));}
}