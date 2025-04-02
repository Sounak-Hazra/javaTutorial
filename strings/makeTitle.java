public class makeTitle {
    public static void makeT(String s) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1;i<s.length()-1;i++){
            if(s.charAt(i-1)==' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String args[]) {
        makeT("hii i am sounak");
    }
}
