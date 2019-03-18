public class testCourse {
    public static void main(String[] args) {
        Course c1 = new Course();
        System.out.print(c1.getNumberofStudents());
        c1.addStudent("kivanc");
        System.out.print(c1.getNumberofStudents()); 
    }
}
class Course {
    String courseName = "Stats";
    String[] students = new String[4];
    int numberofStudents;

    public void addStudent(String student) {
        students[numberofStudents] = student;
        numberofStudents ++;
    }
    String[] getStudents() {
        return students;
    }
    int getNumberofStudents() {
        return numberofStudents;
    }
    String getCourseName() {
        return courseName;
    }
}
