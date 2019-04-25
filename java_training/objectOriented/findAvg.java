public class findAvg {
    public static void main(String[] args) {
        int numofStudents = 10;
        double classTotal =0.0, classAverage=0.0;

        Test[] t = new Test[numofStudents];

        System.out.println("First_Name Last_Name\tTest1\tTest2\tTest3\tTest4\tTest5\tAverage");

        t[0]= new Test("Martin", "Heiddeger", new int[] {85,83,100,78,100});
        System.out.println(t[0].FirstName + " " + t[0].LastName + " " + "\t"+t[0].TestScore[0]+ "\t"+t[0].TestScore[1]+ "\t"+t[0].TestScore[2]+ "\t"+t[0].TestScore[3]+ "\t"+t[0].TestScore[4]+ "\t" +t[0].calculateAvg()); 
        t[1]= new Test("Theodor", "Adorno", new int[] {50,50,67,67,45});
        System.out.println(t[1].FirstName + " " + t[1].LastName + " " + "\t"+t[1].TestScore[1]+ "\t"+t[1].TestScore[1]+ "\t"+t[1].TestScore[2]+ "\t"+t[1].TestScore[3]+ "\t"+t[1].TestScore[4]+ "\t" +t[1].calculateAvg()); 
        t[2]= new Test("Ludwig", "Wittgenstein", new int[] {85,83,97,69,100});
        t[3]= new Test("Antonio", "Negri", new int[] {85,83,86,75,100});
        t[4]= new Test("Slavoj", "Zizek", new int[] {85,83,76,100,100});
        t[5]= new Test("Felix", "Guattari", new int[] {85,83,86,53,56});
        t[6]= new Test("Gilles", "Deleuze", new int[] {85,83,73,73,100});
        t[7]= new Test("Micheal", "Foucault", new int[] {85,83,54,75,100});
        t[8]= new Test("Immanuel", "Kant", new int[] {85,83,87,100,75});
        t[9]= new Test("Georg", "Hegel", new int[] {85,83,82,45,100});

        for (int i = 0; i<numofStudents; i++) {
            t[i].calculateAvg();
            classTotal =+ t[i].calculateAvg();
            classAverage=classTotal/numofStudents;
        }

        System.out.println("Class average = " + classAverage);

    }
}