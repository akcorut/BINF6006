import java.util.*;
import java.io.*;

public class readWrite {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter outfile = new PrintWriter("test.txt");
        String s = "Python";
        int i = 3;
        double d = 3.7;

        outfile.printf(s + "\n" + i + "\n" + d); 
    }
}