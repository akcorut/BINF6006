public class bubbleSort {
    public static void main(String[] args) {
    }
    public static void bubblesort(int array[]) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i<n-1;i++) {
            for (int j=0; j<n-i-1; j++) {
                if (array[j]>array[j+1]) {
                    temp = array[j];
                array[j] = array [j+1];
                array[j+1] = temp;
                }
            }
        }
    }
}