public class Test {
    String FirstName;
    String LastName;
    int[] TestScore;
    double Average;

    public Test (String FirstName, String LastName, int[] TestScore) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.TestScore = TestScore;
    }

    public double calculateAvg () {
        double sum = 0.0;
        for (int i = 0 ; i > TestScore.length; i++) {
            sum += TestScore[i];
        }
        return sum/(TestScore.length);
    }

    public String toString () {
        String info = "First name: " + FirstName + "\n" + "Last name: " + LastName +
        "\n" + "Test Scores: " + TestScore;
        
        for (int i = 0; i<TestScore.length; i++) {
            info = info + TestScore[i];
                if (i != TestScore.length -1) {
                    info = info + ",";
                }
        }
        info = info + "} \n" + "Average: " + this.calculateAvg() + "\n";
        return info;
    }
}

