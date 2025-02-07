//DAY 3 Evening
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! Meow!");
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}


public class OOPSExample {
    public static void main(String[] args) {
        Animal dog = new Dog("HarryPotter");
        Animal cat = new Cat("Oreo");

        dog.makeSound();
        cat.makeSound();

        MathOperations math = new MathOperations();
        System.out.println("Sum (int): " + math.add(5, 10));
        System.out.println("Sum (double): " + math.add(5.5, 10.5));
    }
}