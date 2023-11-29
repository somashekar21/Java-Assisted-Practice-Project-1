package practiceprograms;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        // Creating objects of different classes
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Inheritance allows using methods from the base class
        animal.eat(); // Animal is eating

        // Subclass can use methods from both base and subclass
        dog.eat();    // Animal is eating
        dog.bark();   // Dog is barking
    }
}
