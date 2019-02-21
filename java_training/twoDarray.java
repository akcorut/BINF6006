/** 
 * @author Adnan Kivanc Corut
 */

import java.util.*;
import java.io.*;

public class twoDarray {
    public static void main(String[] args) throws FileNotFoundException{
        File text = new File("/Users/kivanccorut/Desktop/courses_uga/spring_2019/BINF_6006/BINF6006/java_training/test.txt");
        Scanner scnr = new Scanner(text);
        PrintWriter grades = new PrintWriter("/Users/kivanccorut/Desktop/courses_uga/spring_2019/BINF_6006/BINF6006/java_training/result.txt");

        while (scnr.hasNextLine()) {
            Double sum = 0.0;
            Double avg = 0.0;
            Double g1 = scnr.nextDouble();
            sum += g1;
            Double g2 = scnr.nextDouble();
            sum += g2;
            Double g3 = scnr.nextDouble();
            sum += g3;
            avg = (sum/3);
            grades.println(g1 + " " + g2 + " " + g3 + " " + avg);
        }
        grades.close();
        scnr.close();
    }
}