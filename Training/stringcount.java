import java.util.Arrays;
import java.util.Scanner;

public class stringcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        char[] ch=s.toCharArray();
        int count=0;
        // System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == c){
                count ++;
            }
        }
        System.out.println(count);
    }
}
