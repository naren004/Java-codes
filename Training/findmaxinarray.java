import java.util.*;
public class findmaxinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("max = "+arr[arr.length-1]);


        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i+1];
            }
        }
        System.out.println(max);


    }
}
