import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks out of 100");
        int n=sc.nextInt();
        display(n);
        sc.close();
    }
    static void display(int n){
        if(n>=91){
            System.out.println("Grade AA");
        }
        else if(n>=81 && n<=90 ){
            System.out.println("AB");
        }
        else if(n>=71 && n<=80){
            System.out.println("BB");
        }
        else if(n>=61 && n<=70){
            System.out.println("BC");
        }
        else if(n>=51 && n<=60){
            System.out.println("CD");
        }
        else if(n>41 && n<=50){
            System.out.println("DD");
        }
        else if(n<=40){
            System.out.println("FAIL");
        }
        else{
            System.out.println("ENTER THE VALID INPUT");
        }
    }
}