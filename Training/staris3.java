import java.util.Scanner;

public class staris3 {
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
    public static int res(int[] arr,int n){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0 && arr[i]%3 == 0){
                 c++;
            }
        }
        return c;
    }
}