import java.util.Scanner;

public class stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(res(arr,n));
        sc.close();
    }
    static int res(int[] arr,int n){

        int c=0;
        for (int i = 1; i <n; i++) {
            if(arr[i-1] > arr[i]  ){
                c++;
            }
        }
        return c;
    }
}