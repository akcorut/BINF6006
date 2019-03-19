public class addMatrix {
    public static void main(String[] args) {
        double[][] x = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] y = {{2,4,6}, {1,3,5}, {8,9,10}};
        
        double[][] result = addmatrix(x,y); 
        System.out.println("Product of two matrices is: ");
        for(double[] row : result) {
            for (double column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
            }
    }
    public static double[][] addmatrix(double[][] m1, double[][] m2) {
        int rows = 3, cols = 3;
        double[][] sum = new double[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum[i][j] += m1[i][j]  + m2[i][j];
            }
        }
        return sum;
    }
}