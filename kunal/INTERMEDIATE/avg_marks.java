import java.util.Scanner;

public class avg_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ennter no of students ");
        int n=sc.nextInt();
        
        int sum=0;

        for (int i = 1; i <= n; i++) {
            System.out.println("enter student "+i+" marks ");
            int marks=sc.nextInt();
            sum +=marks;
        }
        double avg = sum/n;
        System.out.println("Average marks is ");
        System.out.println(avg);
        sc.close();
    }
}
