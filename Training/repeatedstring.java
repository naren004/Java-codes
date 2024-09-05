import java.util.Scanner;

public class repeatedstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        System.out.println(res(n1,n2));
    }
    public static String res(String n1,String n2){
        String res="";
        for (int i = 0; i < n2.length(); i++) {
            if(n1.charAt(i) != n2.charAt(i)){
                res +=n2.charAt(i);
            }
        }
        return res;
    }
}