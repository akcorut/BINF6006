public class arrayShifting {
    public static void main(String[] args) {
        double temp = mylist[0];

        for(int i = 0; i < mylist.length(); i++) {
            mylist[i-1] = mylist[i];
        }
        mylist[mylist.length()-1] = temp;
    }
}