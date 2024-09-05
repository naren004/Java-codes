import java.util.Scanner;

public class Calculate_Batting_Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the runscore = ");
        int runscore=sc.nextInt();
        System.out.print("enter the hits = ");
        int hits = sc.nextInt();
        double ans=call(runscore,hits);
        System.out.println("average is "+ans);
        sc.close();
    }
    public static double call(int runscore,int hits){
        if (hits==0){
            throw new IllegalArgumentException("not calc");
        }
        return runscore/hits;
    }
}
