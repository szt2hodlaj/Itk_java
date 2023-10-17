public class Reptile extends Animal {
    public Reptile(String name, int age) {
        super(name, age);
    }

    @Override
    public void breed() {
        System.out.println("Reptiles lay eggs to reproduce.");
    }

    @Override
    public void makeSound() {
        System.out.println("Reptiles hiss and make other sounds.");
    }
}