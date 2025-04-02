public class constractorOverloading {
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "sounak";
        s1.roll = 480;

        student s2 = new student(s1);
        System.out.println(s2.name);
    }

}

class student {
    String name;
    int roll;

    student() {
        System.out.println("Student class initilized...");
    }

    student(String name) {
        this.name = name;
    }

    student(int roll) {
        this.roll = roll;
    }

    student(student s) {
        this.name = s.name;
        this.roll = s.roll;
    }
}