import java.util.*;

public class maxArray {
    public static void main(String[] args) {
        
        double max = mylist[0];
        
        for(int i = 0; i < mylist.length(); i++) {
            if(max < mylist[i]) {
                max = mylist[i];
            }
        }
        System.out.println("Maximum value: " +max);
    }
}