import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arraysstring {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String a[]= new String[3];
        // for (int i=0;i<a.length;i++){
        //     a[i]=sc.nextLine();
        // }
        // for(String s : a){
        //     System.out.println(s);
        // }

        // a[1]="naren";
        // System.out.println(Arrays.toString(a));
        // sc.close();
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        call(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void call(int[] arr){
        arr[1]=1;
        //return arr;
    }
}
