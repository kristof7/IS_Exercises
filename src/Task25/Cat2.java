package Task25;

public class Cat2 implements Animal2 {
    @Override
    public void eat() {
        System.out.println("Eat cat food");
    }

    @Override
    public void defaultImplementation() {
        System.out.println("Cat implementation");
    }
}
