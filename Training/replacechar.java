import java.util.*;
public class replacechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char ch1=sc.next ().charAt(0);
        char ch2=sc.next ().charAt(0);
        System.out.println(res(str,ch1,ch2));
    }
    static String res(String str,char ch1,char ch2){
        String res="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch1){
                res +=ch2;
            }else if(str.charAt(i) == ch2){
                res +=ch1;
            }else{
                res +=str.charAt(i);
            }
        }
        return res;
    }
}