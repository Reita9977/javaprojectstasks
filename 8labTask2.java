public class Task2 {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Little brown", 2, 2, "Bat");
        animal[1] = new Dog("Jack", 5, 15, "Carnivora", "Labrador");
        animal[2] = new Bird("Platypus", 2, 1, "White");
        animal[3] = new Pigeon("Pigeon", 1, 0.5f, "Grey", "Rock Pigeon");
        animal[4] = new Fish("Nemo", 1, 3, "Mixed orange-white-black");
        animal[5] = new Blowfish("Blowfish", 5, 2, "Brown", 0.5f);

        animal[1].voice();
        animal[3].voice();

        // Exercise 8
        ScreenCleaner.clearScreen();
        System.out.println();
        for (Animal a : animal) {
            a.move();
        }

        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0] = new Dog("Jack", 5, 15, "Carnivora", "Labrador");
        animalBehavior[1] = new Pigeon("Pigeon", 1, 0.5f, "Grey", "Rock Pigeon");
        animalBehavior[2] = new Blowfish("Blowfish", 5, 2, "Brown", 0.5f);

        System.out.println();
        animalBehavior[1].sleep();

        System.out.println();
        for (AnimalBehavior a : animalBehavior) {
            AnimalName.name(a.getClass().getName());
        }

        // abstract class vs. interface
        // singular inheritance (extend only once)
        // multiple inheritance (implements)
    }
}

abstract class Animal implements AnimalMove {
    String name;
    int age;
    float weight;

    abstract void eat();

    abstract void voice();

    String getName() {
        return name;
    }
}

interface AnimalName {
    static void name(String name) {
        System.out.println("The name is: " + name);
    }
}

interface AnimalMove {
    default void move() {
        System.out.println("Animal moves");
    }
}

interface AnimalBehavior {
    void sleep();
}

class Mammal extends Animal {
    String order;

    Mammal(String name, int age, float weight, String order) {
        this.name = name;
        this.age = age;
        this.weight = weight;

        this.order = order;
    }

    void eat() {
        System.out.println("Mammal eats");
    }

    void voice() {
        System.out.println("Mammal voice");
    }
}

class Bird extends Animal {
    String featherColor;

    Bird(String name, int age, float weight, String featherColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;

        this.featherColor = featherColor;
    }

    void eat() {
        System.out.println("Bird eats");
    }

    void voice() {
        System.out.println("Bird voice");
    }
}

class Fish extends Animal {
    String scaleColor;

    Fish(String name, int age, float weight, String scaleColor) {
        this.name = name;
        this.age = age;
        this.weight = weight;

        this.scaleColor = scaleColor;
    }

    void eat() {
        System.out.println("Fish eats");
    }

    void voice() {
        System.out.println("Fish voice");
    }
}

class Dog extends Mammal implements AnimalBehavior {
    String breed;

    Dog(String name, int age, float weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }

    @Override
    void voice() {
        System.out.println("Dog voice");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps, zzz");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
    
}

class Pigeon extends Bird implements AnimalBehavior {
    String species;

    Pigeon(String name, int age, float weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    void eat() {
        System.out.println("Pigeon eats");
    }

    @Override
    void voice() {
        System.out.println("Pigeon voice");
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon sleeps, zzz");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies");
    }
}

class Blowfish extends Fish implements AnimalBehavior {
    float diameter;

    Blowfish(String name, int age, float weight, String scaleColor, float diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    @Override
    void eat() {
        System.out.println("Blowfish eats");
    }

    @Override
    void voice() {
        System.out.println("Blowfish voice");
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps, zzz");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims");
    }
}
