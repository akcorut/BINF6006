import java.util.*;
import java.io.*;

public class twoDarray {
    public static void main(String[] args) throws FileNotFoundException{
        File text = new File("/Users/kivanccorut/Desktop/courses_uga/spring_2019/BINF_6006/BINF6006/java_training/test.txt");
        Scanner scnr = new Scanner(text);
        PrintWriter grades = new PrintWriter("/Users/kivanccorut/Desktop/courses_uga/spring_2019/BINF_6006/BINF6006/java_training/result.txt");

        while (scnr.hasNextLine()) {
            double n1 = scnr.nextDouble();
            grades.println(n1);
        }
        grades.close();
        scnr.close();
    }
}