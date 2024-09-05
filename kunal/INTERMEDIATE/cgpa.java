import java.util.Arrays;
import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many sem did  complete");
        int n=sc.nextInt();
        double arr[]=new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter "+(i+1) +" sem mark");
            arr[i]=sc.nextDouble();
        }
        System.out.println("Marks ");
        System.out.println(Arrays.toString(arr));

        //String len=String.valueOf(arr);
        // int l=arr.length;
        // System.out.println(l);

        double sum=0;
        for (int i = 0; i < n; i++) {
            sum =sum+arr[i];
        }
        System.out.println(Math.round(sum/n));

    }
}
