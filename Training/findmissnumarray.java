import java.util.Scanner;

public class findmissnumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(res(n,arr));

        }
        static int res(int n,int[] arr){


            n=arr.length+1;

            int tsum = n*(n+1)/2;
            System.out.println(tsum);

            int sum=0;

            for(int num : arr){
                sum +=num;
            }

            return tsum - sum;
        }
}
