public class facRec {
    public static long factorial(long n) {
            if (n==0) 
                return 1;
            else
                return n * factorial(n-1);
    }
    public static void main(String[] args) {
        for (int counter = 0; counter <=21; counter ++)
            System.out.printf("%d! = %d%n", counter, factorial(counter));
    }
}

