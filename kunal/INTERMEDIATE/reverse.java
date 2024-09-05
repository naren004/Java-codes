import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        int l=s.length();
        String ans="";
        for(int i=l-1;i>=0;i--){
            char ch=s.charAt(i);
            ans = ans +ch;
        }
    System.out.println(ans);
    }
}