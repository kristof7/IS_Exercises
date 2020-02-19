package Task27;

public class Task27 {
    public static void task27() {

        CatA catA = new CatA();
        DogA dogA = new DogA();

        System.out.println("   CatA abstract method:");
        catA.abstractMethod();
        System.out.println("   DogA abstract method:");
        dogA.abstractMethod();
        System.out.println("------------------------");
        System.out.println("   CatA method:");
        catA.method();
        System.out.println("   DogA method:");
        dogA.method();

    }
}
