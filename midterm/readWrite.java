import java.util.*;
import java.io.*;

public class readWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File text = new File("/Users/kivanccorut/Desktop/courses_uga/spring_2019/BINF_6006/BINF6006/midterm/text.txt");
        Scanner scn = new Scanner(text);
        PrintWriter outfile = new PrintWriter("/Users/kivanccorut/Desktop/courses_uga/spring_2019/BINF_6006/BINF6006/midterm/result.txt");


        while (scn.hasNextLine()) {
            String temp;
            String s1 = scn.nextLine();
            temp = s1;
            
            if (temp.charAt(0) == "M" && temp.charAt(1) == "1")
                outfile.println("Mathemetics Freshman");
        }
        outfile.close();
        scn.close();
    }
}