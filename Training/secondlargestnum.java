import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class secondlargestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] temp = new int[n];
        int j=0;
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length- 1; i++) {
            if(arr[i] != arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));

        System.out.println(temp[temp.length-2]);
    }
}
