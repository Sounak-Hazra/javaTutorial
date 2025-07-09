// Abstraction: Abstract class with abstract-like methods
abstract class AbstractAnimal {
    abstract void setNameFood(String name, String food);

    abstract void getNameFood();
}

// Inheritance: Animal inherits from AbstractAnimal
// Encapsulation: name and food are private
class Animal extends AbstractAnimal {
    private String name, food; // Access specfier this veriables cannot access by its child class or object 

    Animal(String name, String food) { // Parameterized Constractor
        this.name = name;
        this.food = food;
    }

    Animal() { // Not Parameterized Constractor
        this("Dont have name", "Eat food");
    }

    // 🆕 Copy Constructor
    Animal(Animal other) {
        this.name = other.name;
        this.food = other.food;
    }

    void setNameFood(String name, String food) {
        this.name = name; // this keyword
        this.food = food; // this keyword
    }

    void getNameFood() {
        System.out.println(name);
        System.out.println(food);
    }
}

// Inheritance: Dog inherits from Animal
// Polymorphism: Overriding getNameFood()
class Dog extends Animal {
    private Boolean isPet;

    Dog(String name, String food) { // Constractor
        super(name, food); // Super keyword calls parent’s constructor
    }

    Dog() { // Default Constractor
        super(); // Super keyword calls parent’s constructor
    }

    // 🆕 Copy Constructor for Dog
    Dog(Dog other) {
        super(other); // call Animal's copy constructor
        this.isPet = other.isPet;
    }

    void setName(String name, String food, Boolean isPet) { // this is message passing
        super.setNameFood(name, food); 
        this.isPet = isPet;
    }

    void getNameFood() {
        if (isPet) {
            System.out.println("This is a pet");
            super.getNameFood(); 
        }
    }

    void getNameFood(Boolean notPet) { // static polymorphism (method overloading)
        if (!isPet) {
            System.out.println("This is not a pet");
            super.getNameFood(); 
        }
    }
}

// Main method to test the class
class Solution {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.setName("Bruno", "Bones", true);
        d1.getNameFood();

        System.out.println("\nCopied Dog:");

        Dog d2 = new Dog(d1); // using copy constructor
        d2.getNameFood();
    }
}
