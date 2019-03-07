public class BubbleSort {
    
    static void bubblesort(int[] array) {
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
    public static void main(String[] args) {
        int array[] = {56, 20, 43, 23, 10};
        bubblesort(array);
        System.out.println("Array After Bubble Sort");  
                for(int i=0; i < array.length; i++){  
                        System.out.print(array[i] + " ");
                }  
    }
}