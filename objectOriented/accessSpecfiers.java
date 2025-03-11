public class accessSpecfiers {
    public static void main(String args[]) {
        bank user1 = new bank();
        user1.setPassword("1234");
        user1.username = "hello";
    }
}

class bank {
    public String username;
    private String password;

    protected void setPassword(String ps){
        password = ps;
    }
}
