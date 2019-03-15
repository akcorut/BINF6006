public class test{
    public static void main(String[] args) {
        person me = new person();
        System.out.println("Person's name: " + me.name 
        + "\nPhone: " + me.phone 
        + "\nSSN: " + me.ssn);
        student s1 = new student("Sophomore");
        System.out.println("Class status: " + s1.status);
        employee e1 = new employee();
        System.out.println("Employee's office: " + e1.office 
        + "\nSalary: " + "$"+e1.salary);
        faculty f1 = new faculty();
        System.out.println("Office hours: " + f1.hours 
        + "\nRank: " +f1.rank);
        staff stf1 =  new staff();
        System.out.println("Staff name: " + stf1.name 
        + "\nPhone: " + stf1.phone 
        + "\nSSN: " + stf1.ssn);
    }
}
class person {
    public String name = "Kivanc";
    public String phone = "706540000";
    public String ssn = "0000000";
}
class student extends person {
    String status;
    public student (String status) {
        this.status = status;
    }
}
class employee extends person {
    public String office = "Boyd111";
    public double salary = 23400;
}
class faculty extends employee {
    public String hours ="12-1";
    public String rank = "Associate";
}
class staff extends employee {
}
