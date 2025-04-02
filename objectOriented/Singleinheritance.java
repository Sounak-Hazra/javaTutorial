public class Singleinheritance {
    public static void main(String args[]) {
        
    }
}

class Animals {
    String name;

    void isEat() {
        System.out.println("This animal eats...");
    }
}

class Dogs extends Animals {
    void numLegs() {
        System.out.println("It has 4 legs..");
    }
}