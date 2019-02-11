public class equalArrays {
    public static Boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++)
            if (list1[i] == list2[i])
        return true;
    }
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4};
        int[] list2 = {1, 2, 3, 4};
        System.out.print(equals(list1, list2));
    }
}