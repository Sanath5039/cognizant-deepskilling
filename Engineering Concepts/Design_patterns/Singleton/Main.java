public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.display();

        System.out.println("obj1 hashcode: " + obj1.hashCode());
        System.out.println("obj2 hashcode: " + obj2.hashCode());

        if (obj1 == obj2) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("Different objects created.");
        }
    }
}