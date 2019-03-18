public class testAnimal {
    public static void main(String[] args) {
        animal a1 = new animal();
        dog d1 = new dog();
        System.out.println("Owner is " + d1.owner);
        d1.sleep();
        d1.sound();
        a1.sound();
    }
}
class animal {
    String owner = "Bob";
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void sound() {
        System.out.println("Animal is making sound");
    }
}
class dog extends animal {
    public void sound() {
        System.out.println("Bark");
    }
}