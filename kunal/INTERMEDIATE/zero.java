import java.util.*;
public class zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers if enter 0 the calculation will show");
        int sumneg=0;
        int poseven=0;
        int posodd=0;
        while (true) {
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            else{
                if (n<0){
                    sumneg += n;
                }
                if (n%2==0){
                    poseven += n;
                }
                if (n%2==1){
                    posodd += n;
                }
            }
        }
        System.out.println("sum negative "+sumneg);
        System.out.println("sum positive even  "+poseven);
        System.out.println("sum positive odd "+posodd);      
    }
}