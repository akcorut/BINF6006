import java.util.*;

public class ranNumGen {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        Random rand = new Random();
        for (int i = 0; i<=5000000; i++) {
            int num = rand.nextInt(1000);
        }
        Long end = System.currentTimeMillis();
        System.out.println("First time is " + (end - start) + "ms");

        Long start2 = System.currentTimeMillis();
        for (int i = 0; i<=500000; i++) {
            int x = (int) Math.random()*1000+1;
        }
        Long end2 = System.currentTimeMillis(); 
        System.out.println("Second time is " + (end2 - start2) + "ms"); 
    }
}