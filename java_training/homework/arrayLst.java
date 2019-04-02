/**
 * @author Adnan Kivanc Corut
 */

import java.util.*;

public class arrayLst {
    public static void main(String[] args) {
        ArrayList<Double> dupList = new ArrayList<Double>(10);
        dupList.add(2.3);
        dupList.add(2.3); 
        dupList.add(3.2);
        dupList.add(3.2);
        dupList.add(4.5);
        dupList.add(4.5);
        dupList.add(5.2);
        dupList.add(6.3);
        dupList.add(7.8);
        dupList.add(9.2);

        ArrayList<Double> newList = new ArrayList<Double>(10);

        for(Double i : dupList){
            if(dupList.indexOf(i) == dupList.lastIndexOf(i))
            newList.add(i);
        }
        System.out.println(newList);
    }
}