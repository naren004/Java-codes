import java.util.*;
public class stringsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "naren";
        System.out.println("enter the char");
        char ch=sc.next().charAt(0);
        boolean ans = call(s,ch);
        System.out.println(ans);
    }
    static boolean call(String s , char ch){
        if(s.length() == 0){
            return false;
        }
        for(char c: s.toCharArray()){
            if(c==ch){
                return true;
            }
        }
        return false;
    }
}
