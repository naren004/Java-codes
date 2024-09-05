
import java.util.*;

public class mathop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(call(n,n1,n2));
    }
    static int call(int n , int n1,int n2){
        switch (n) {
            case 1:
                return n1+n2;
                // break;
            case 2:
                return n1-n2;
                // break;
            case 3:
                return n1/n2;
                // break;
            case 4:
                return n1*n2;
                // break;
        }
        return 0;
    }

}
