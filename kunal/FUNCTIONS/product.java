import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int pro=proc(a,b);
        System.out.println("ans = "+pro);
    }
    public static int proc(int a,int b){
         return a*b;
    }
}
