public class testVoid {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is "+ x);
        int y = increment(x);
        System.out.println("After the call, x is "+ y); 
    }
    public static int increment(int n) {
        n++;
        System.out.println("n inside the method is "+ n);
        return n;
    }
}