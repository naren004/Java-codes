import java.util.Scanner;

public class sumnat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans =fun(n);
        System.out.println(ans);
    }
    static int fun(int n){
    int sum=0;
    for (int i = 0; i <= n; i++) {
        sum +=i;
    }
    return sum;
} 
} 