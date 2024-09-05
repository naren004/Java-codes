import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int pro=call(a,b);
        System.out.println("pro = "+pro);
        sc.close();
    }
    static int call(int a , int b){
        return a*b;
    }
}
