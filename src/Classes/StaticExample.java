package Classes;

public class StaticExample {

    public int intValue;
    public Integer integerValue;

    public StaticExample() {
    }
    public static void staticMethod() {
        System.out.println("This is static method");}
    public void nonStaticMethod() {
        System.out.println("This is non static method");
    }
    public StaticExample(int intValue) {
        this.intValue = intValue;
    }
    public StaticExample(Integer integerValue) {
        this.intValue = integerValue;
    }
}
