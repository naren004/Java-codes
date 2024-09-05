/**
 * resstirng
 */
import java.util.*;
public class resstirng {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();
        System.out.println(res(s));
    }
    static String res(String s){
        String str="";
        for (int i = 0; i < s.length(); i++) {
            str = s.charAt(i) + str;
        }
        return str;
    }
}