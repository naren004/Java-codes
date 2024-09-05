import java.util.Scanner;
public class MoveHyphen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(res(s));
    }
    public static String res(String s){
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-'){
                res = s.charAt(i) + res ;
            }else{
                res = res + s.charAt(i);
            }
        }
        return res;
    }
}