import java.util.*;

public class computeLetters {
    public static int letterCount(String s) {
        
        int sum = 0;
        for(int i = 0; i < s.length(); i++) 
            if (Character.isLetter(s.charAt(i)))
                sum++;
            return sum;
    }
    public static void main(String[] args) {
        System.out.println(letterCount("Test123"));
    }
}