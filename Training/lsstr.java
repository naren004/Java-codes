import java.util.Scanner;

public class lsstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";

        for (int i = 0; i < s.length(); i++) {
            str=s.charAt(i)+str;
        }
        System.out.println(str);
        sc.close();
    }
}