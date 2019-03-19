public class testCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Math");
        System.out.print("Course name: " + c1.getCourseName());
        c1.addStudent("kivanc");
        c1.addStudent("noah");
        c1.addStudent("lynnsey");
        System.out.print("\nNumber of students: " 
            + c1.getNumberofStudents());
        String[] students = c1.getStudents();
        for (int i=0; i < c1.getNumberofStudents(); i++)
            System.out.print("\n" + students[i] + ", ");
    }
}
class Course {
    String courseName;
    String[] students = new String[4];
    int numberofStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
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
