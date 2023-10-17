public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Mammals give birth to live young to reproduce.");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammals make various sounds.");
    }
}