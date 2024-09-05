import java.util.*;
public class palindrome_string {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String temp=s;
        String nstr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            nstr = ch + nstr;
        }

        System.out.println("REVERSED STRING IS >> "+nstr);
        if (temp.equals(nstr)){
            System.out.println(nstr+" It is a palindrome string ");
        }
        else{
            System.out.println("not a palindrome string");
        }
    }
}
