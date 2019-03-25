public class recPrac {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++)
            System.out.print("\n" + comp(i));
    }
    public static double comp(double n) {
        if (n==0)        
            return 0;
        if (n==1)
            return 1;
        else
            return 1/n + comp(n-1);
    }
}