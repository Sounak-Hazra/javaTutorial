public class binaryToDesimal {

    public static int changeToDecimal(int num) {
        int pow = 0;
        int decimal = 0;
        while (num > 0) {
            int reminder = num % 10;
            decimal = decimal + reminder*(int) Math.pow((double) 2, (double) pow);
            num /= 10;
            pow += 1;
        }
        return decimal;
    }
    public static void main(String args[]) {
        int decimal = changeToDecimal(1000);
        System.out.println(decimal);
    }
}