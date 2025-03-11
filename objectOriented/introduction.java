public class introduction {
    public static void main(String args[]) {
        pen p1 = new pen();
        p1.color = "red";
        System.out.println(p1.color);
        System.out.println(p1.type);
    }
}

class pen {
    String color = "blue";
    String type = "ballpoint";
}