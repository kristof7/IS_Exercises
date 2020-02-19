package Task28S;

import Task23.Animal;
import Task23.Cat;
import Task23.Dog;

import java.util.HashSet;
import java.util.Set;

public class Task28S {

    public static void task28() {

        Cat catS = new Cat();
        catS.setName("Cat tester");
        Dog dogS = new Dog();
        dogS.setName("Dog tester");

        Set<Animal> animals = new HashSet<>();
        animals.add(catS);
        animals.add(dogS);

        for (Animal animal : animals) {
            System.out.println("Animals: "+animal.getName());

        }
    }
}
