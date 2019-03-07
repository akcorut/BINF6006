public class loopPractice {
    public static void main(String[] args) {
        
        int total = 0;

        for(int number = 100; number <= 1000; number ++)
            if ( number % 5 == 0 && number % 6 == 0) {
                total ++; 
            }
            System.out.print(total);
    }
}