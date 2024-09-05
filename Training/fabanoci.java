import java.util.Scanner;

public class fabanoci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int n1=0;
        int n2=1;
        // int n3=0;
        int c=1;
        for (int i = 0; i < n; i++) {
           int n3=n1+n2;
        //    System.out.println(n3);
           c +=n3;
            n1=n2;
            n2=n3;
            
            
        }
        System.out.println(c);
    }
}
