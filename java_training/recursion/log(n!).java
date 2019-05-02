
// Java implementation of the above approach 
import java.util.*; 
import java.io.*; 
class logfact { 
    public static double fact(int n) 
    { 
        if (n == 1) 
            return 0; 
        return fact(n - 1) + Math.log(n); 
    } 
  
    public static void main(String[] args) 
    { 
  
        int N = 3; 
        System.out.println(fact(N)); 
    } 
} 
