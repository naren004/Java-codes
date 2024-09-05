import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pali(n);
    }
    static void pali(int a){
        int sum=0;
        int temp=a;
        while (a>0) {
            int r=a%10;
            sum =(sum*10)+r;
            a /=10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("NOT");
        }
    }
}
