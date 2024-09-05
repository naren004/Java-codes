import java.util.*;

public class op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1 ");
        int a=sc.nextInt();
        System.out.println("enter num 2 ");
        int b=sc.nextInt();
        System.out.println("enter op");
        char op=sc.next().charAt(0);

        if (op=='+'){
            System.out.println("A+B="+(a+b));
        }
        else if(op=='-'){
            System.out.println("A-B="+(a-b));
        }
        else if(op=='*'){
            System.out.println("A*B="+(a*b));
        }
        else if(op=='/'){
            if (b==0){
                System.out.println("0 is not alloed");
            }else{
            double ans=a/b;
            System.out.println("A/B="+ans);
            }
        }
        else{
            System.out.println("Invalid operation");
        }
        }
}
