import java.util.Scanner;

public class find_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("enter num : ");
        int num=sc.nextInt();
        System.out.print("enter diff : ");
        int diff=sc.nextInt();

        System.out.println(res(arr,num,diff));

        sc.close();
    }
    public static int res(int[] arr,int num,int diff){
        int c=0;
        for (int j = 0; j < arr.length; j++) {
            int ans = Math.abs(num-arr[j]);
            if (ans <= diff){
                c++;
            }
        }
    return c;
    }
}