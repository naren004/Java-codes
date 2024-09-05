import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        fact(n);
    }
    static void fact(int n){
       int sum=1;
       if (n<1){
        System.out.println(1);
       }else{
        for (int i = n; i > 0; i--) {
            sum=i*sum;
        }
        System.out.println(sum); 
    }}
}
