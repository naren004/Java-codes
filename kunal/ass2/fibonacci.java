import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n1=0;
        int n2=1;
        System.out.print("Enter the number upto the series wants to go=");
        int n=sc.nextInt();
        System.out.print(n1+" , "+n2+" , ");
        for (int i=0;i<n-2;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" , ");
        }
        
    }
}