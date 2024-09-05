import java.util.*;
public class duplicate {

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String ans = call(s);
        System.out.println("ans = "+ans);
        sc.close();
    }
    public static String call(String s){
        String nstr = new String();
        for (int i = 0; i < s.length(); i++) {
            char at=s.charAt(i);
            if(nstr.indexOf(at) < 0){
                nstr += at;
            }
        }
        return nstr;
    }
}