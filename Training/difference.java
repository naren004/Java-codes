import java.util.*;

public class difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        System.out.println(ans(n,m));
    }
    public static int ans(int n,int m) {
       int div =0;
       int not_div =0;
        for (int i = 1; i <= m; i++) {
            if(i%n==0){
                div +=i;
                // System.out.println(div);

            }else{
                not_div +=i;
                // System.out.println(not_div);
            }
        }
        return Math.abs(not_div-div);
    }
}
