public class Qtwo {

    static void printNum(int num){
        //base case
        if (num == 0) {
            return;
        }

        //kam
        printNum(num/10);
        int n = num%10;
        if(n==0){
            System.err.print("zero ");
        }
        else if(n == 1){
            System.out.print("one ");
        }
        else if(n == 2){
            System.out.print("two ");
        }
        else if(n == 3){
            System.out.print("three ");
        }
        else if(n == 4){
            System.out.print("fore ");
        }
        else if(n == 5){
            System.out.print("five ");
        }
        else if(n == 6){
            System.out.print("six ");
        }
        else if(n == 7){
            System.out.print("seven ");
        }
        else if(n == 8){
            System.out.print("eight ");
        }
        else if (n == 9) {
            System.out.print("nine ");
        }
    }
    public static void main(String args[]) {
        printNum(2001);
    }
}
