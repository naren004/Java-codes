import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();
        String s=String.valueOf(val);

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // int n=s.indexOf(i);
            // System.out.println(n);
            if  (ch[i] % 2 == 0){
                // System.out.println(n);
                System.out.print("even");
            }else{
                System.out.print("odd");
            }
        }
        sc.close();
    }
}
