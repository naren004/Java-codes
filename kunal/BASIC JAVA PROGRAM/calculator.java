import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        
        while (true) {
            
        System.out.println("Enter operation");
        
        char ch=sc.next().charAt(0);
            if  (ch =='+' || ch == '-' || ch =='*' || ch =='/'){
                System.out.println("enter the 2 nnumbers");

                int n1=sc.nextInt();
                int n2=sc.nextInt();

                if(ch=='+'){
                    ans =n1+n2;
                }
                if(ch=='-'){
                    ans =n1-n2;
                }
                if(ch=='*'){
                    ans =n1*n2;
                }
                if(ch=='/'){
                    if (n2!=0){
                    ans =n1/n2;
                }
            }
        }
            else if (ch =='x'|| ch=='X'){
                    break;
                }
                else{
            System.out.println("invalid operation");
            }
            System.out.println(ans);      
        }
    }
}