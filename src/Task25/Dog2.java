package Task25;

public class Dog2 implements Animal2{
    @Override
    public void eat() {
        System.out.println("Eat dog food");
    }

    @Override
    public void defaultImplementation() {
        System.out.println("Dog implementation");
    }
}
