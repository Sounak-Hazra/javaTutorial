public class AbstractClass {
    public static void main(String args[]) {
        MailLion ml = new MailLion();
        ml.eat();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal class constractor called..");
    }

    abstract void eat();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat");
    }
}

class MailLion extends Lion {
    
}
