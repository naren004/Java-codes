import java.util.Scanner;

public class div3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=sc.nextInt();
        int c=0;

        for (int i = m; i <=n; i++) {
            if((i%3==0) && (i%5==0)){
                c +=i;
            }
        }
        System.out.println(c);
    }
    
}