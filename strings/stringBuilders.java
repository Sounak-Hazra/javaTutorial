// import java.util.*;
public class stringBuilders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char i = 'a';i<='z';i++){
            sb.append(i);
        }
        System.out.println(sb);
    }
}