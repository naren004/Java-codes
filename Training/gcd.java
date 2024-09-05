import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(res(a,b));
    }
    static int res(int a,int b){
        if (a == 0){
            return b;
        }else{
            return res(b%a,a);
        }
        // return 0;
    }
}
