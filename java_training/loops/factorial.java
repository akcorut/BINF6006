public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int fac = 1;
        for (int i=2; i <= n; i++) {
            fac *= i;
        }
        System.out.print(fac);
    }
}