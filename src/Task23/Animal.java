package Task23;

public class Animal {
    private String name;
    protected void eat() {
        System.out.println("Eating animal food");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
