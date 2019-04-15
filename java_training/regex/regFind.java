import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regFind {
    public static void main(String[] args) {
        String input = "The medium is the message!";
        String regexe = "me";

        Pattern pattern = Pattern.compile(regexe, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("find() found the pattern\"" + matcher.group()
                + "\" starting at index" + matcher.start()
                + " and ending at index " + matcher.end());
        }
    }
}