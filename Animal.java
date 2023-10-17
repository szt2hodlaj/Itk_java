public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public abstract void breed();

    // You can add more fields and methods as needed

    public abstract void makeSound();

    public int getAge() {
        return age;
    }
}
