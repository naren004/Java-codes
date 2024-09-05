import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        fun(a,b,c);
    }
    static void fun(int a , int b , int c){
        int aa=a*a;
        int bb=b*b;
        int cc=c*c;
        int ans=aa+bb;
        if(ans==cc){
            System.out.println("its Pythagorean");
        }else{
        System.out.println("not Pythagorean");
    }}
}
