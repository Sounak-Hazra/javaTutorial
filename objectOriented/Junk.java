public class Junk {
    public static class Example {
        public static void greetingsFromParent() {
            System.out.println("Hello i am a static method and i am called by the class name.");
        }

        public void greetings() {
            System.out.println("Hello i am a non static method and i am called by the object of this class.");
        }
    }
    
    public static void main(String args[]) {
        Example.greetingsFromParent();
        Example ex = new Example();
        ex.greetings();
    }
}
