import java.util.*;

public class palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(res(s));
    }
    static String res(String s){
        String nstr="";
        for (int i = 0; i < s.length(); i++) {
            nstr = s.charAt(i)+nstr;

        }
        // System.out.println(nstr);
        if(s.equals(nstr)){
            return "yes";
        }else{
            return "not";
            // System.out.println();
            // System.out.println(nstr);
        }
        
    }
    
}
