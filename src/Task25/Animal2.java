package Task25;

public interface Animal2 {
    void eat();
    default void defaultImplementation() {
        System.out.println("Animals Implementation");
    }
}
