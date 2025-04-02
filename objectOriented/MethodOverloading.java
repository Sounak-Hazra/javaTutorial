public class MethodOverloading {
    public static void main(String args[]) {
        Animal an = new Animal();
        an.canEat();
        an.canEat("Kutta");

        Tiger ti = new Tiger();
        ti.canEat();
    }
}

class Animal {
    void canEat() {
        System.out.println("It can eat ...");
    }

    void canEat(String name) {
        System.out.println("This animal " + name + " can eat");
    }
}

class Tiger extends Animal {
    void canEat() {
        System.out.println("Tigher can eat");
    }
}

