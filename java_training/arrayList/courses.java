import java.util.*;

public class courses {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();
        
        courses.add("Biology");
        courses.add("Math1");
        courses.add("Physic1");

        System.out.print(courses.toString());

        courses.add(2, "Chem1");

        System.out.print("\n" + courses.toString()); 

        courses.remove(3);
        System.out.print("\n" + courses.toString());
        
        Collections.sort(courses);
        System.out.print("\n" + courses.toString());
        
        courses.remove(0);
        System.out.print("\n" + courses.toString());
    }
}