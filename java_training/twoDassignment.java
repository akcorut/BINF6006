public class twoDassignment {
    public static void main(String[] args) {
        double[][] grades = {
    {1.23, 2.34, 3.45},
    {4.56, 5.67, 6.78},
    {12.34, 5.44, 3.65},
    {23.45, 34.56,45.67}
};
    double[] result = rowAverage(grades);
    for(double row : result) {
        for (double column : row) {
            System.out.print(column + "    ");
    }
        System.out.println();
    }
}
    public static double[] rowAverage(double[][] row) {
        double average[] = new double[row.length];
        double total[] = new double[row[0].length];
        int sum = 0;
        for (int i = 0; i < row.length -1; i++){
            for (int j = 0; j < row[0].length; j++){             
                total[i] = sum + row[i][j];
            }
            average[i] = total[i] / row.length;
        }
        return average;
    }
}