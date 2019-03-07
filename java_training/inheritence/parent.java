public class parent {
    public void talk() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        child c = new child ();
            c.talk();
            c.walk(20);
    }
}