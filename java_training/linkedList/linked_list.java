import java.util.*;

public class linked_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();

        LinkedList<Integer> list = new LinkedList<Integer>();

        int num, sum;
        for (int i=0; i<size; i++) {
            System.out.println("Enter "+ i + ". element:");
            num = input.nextInt();
            list.add(num);
        }
        System.out.println(list);
            sum = sumresult(list);
            System.out.println("Sum is: " + sum);
    }
    public static int sumresult(LinkedList<Integer> list) {
        int mysum = 0;
        for (int i=0; i<list.size(); i++) 
            mysum += list.get(i);
        return mysum;
    }
}