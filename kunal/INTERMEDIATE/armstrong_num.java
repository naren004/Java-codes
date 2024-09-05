import java.util.Scanner;

public class armstrong_num {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        String a=Integer.toString(num);
        int len=a.length();
        //System.out.println(len);
        int temp=num;
        int sum=0;
        while (num>0) {
            int r=num%10;
            sum += Math.pow(r, len);
            num/=10;
        }
        if (temp==sum){
            System.out.println(sum +" is a armstrong number");
        }
        else{
            System.out.println("NOT a ARMSTRONG NUMBER");
        }      
    }
}