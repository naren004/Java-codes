import java.util.Scanner;
public class retuenindex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int d=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(res(arr,q,d,r));
    }
    public static int res(int[] arr,int q,int d,int r){
        int div=(q*d)+r;
        for (int i = 0; i < arr.length; i++) {
            if(div==arr[i]){
                return i;
            }
        }
        return -1;
    } 
}