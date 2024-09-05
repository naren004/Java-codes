import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total amnt ");
        double tamnt=sc.nextDouble();
        System.out.println("enter the commision amount he bought ");
        double camnt=sc.nextDouble();
        double com_per= call(tamnt,camnt);
        System.out.print("commision percentage = ");
        System.out.println(Math.floor(com_per)+" %");
    }
    public static double call(Double tamnt,Double camnt){
        if (tamnt==0){
            System.out.println("cannot calc");
        }
        return (camnt/tamnt)*100;
    }
}