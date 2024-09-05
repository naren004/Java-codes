import java.util.Scanner;

class pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        patterncall(n);
        patterncallreverse(n);

    }
    static void patterncall(int n){
        for(int i = 1 ; i <= n ; i++ ){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterncallreverse(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}