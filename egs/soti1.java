import java.util.*;

public class soti1 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int y=sc.nextInt();
        double intrest=(p*r*y)/100;
        double amnt=intrest+p;
        double dis=(2*intrest)/100;
        double fin=amnt-dis;
        System.out.printf("%.2f\n",intrest);
        System.out.printf("%.2f\n",amnt);
        System.out.printf("%.2f\n",dis);
        System.out.printf("%.2f\n",fin);
        sc.close();
    }
}