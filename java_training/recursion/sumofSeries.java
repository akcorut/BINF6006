class GFG { 
  
    // Recursive function to return 
    // the sum of the given series 
    static long sum(int n) 
    { 
  
        // 1^1 = 1 
        if (n == 1) 
            return 1; 
        else
  
            // Recursive call 
            return ((long)Math.pow(n, n) + sum(n - 1)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 2; 
        System.out.println(sum(n)); 
    } 
} 