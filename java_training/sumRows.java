public class  sumRows {
    public static void main(String[] args) {
        int[][] mtrx = {{2,4,6},{1,3,5}};
        for (int row = 0; row < mtrx.length; row++) {
        int total = 0;
        {
            for (int column = 0; column < mtrx[row].length; column++) {
                total += mtrx[row][column];
            }
            System.out.println(total);
        }
    }
    }
}