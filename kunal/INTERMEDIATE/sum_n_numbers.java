import java.util.*;

public class sum_n_numbers {
    public static  void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the nnumbers if u enter 0 then will print the sum of all numbers ");
        int sum=0;
        while(true){
        int n=sc.nextInt();
        if(n==0){
            break;
        }
        sum +=n;
    }
    System.out.println("sum of above numbers is  ");
    System.out.println(sum);
    sc.close();
}
}
