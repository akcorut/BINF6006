public class  sumCols {
    public static void main(String[] args) {
        int[][] mtrx = {{2,4,6},{1,3,5}};
        for (int col = 0; col < mtrx[0].length; col++) 
        {
        int total = 0;
        {
            for (int row = 0; row < mtrx.length; row++) {
                total += mtrx[row][col];
            }
            System.out.println(total);
        }
    }
    }
}