public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Birds lay eggs to reproduce.");
    }

    @Override
    public void makeSound() {
        System.out.println("Birds chirp and sing.");
    }
}