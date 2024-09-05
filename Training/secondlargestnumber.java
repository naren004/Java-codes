import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class secondlargestnumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ArrayList <Integer> odd=new ArrayList<>();
        ArrayList <Integer> even=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort (even);
        Collections.sort (odd);


        System.out.println(odd);
        System.out.println(even);

        int odd_num = odd.get(odd.size()-2);
        int even_num = even.get(even.size()-2);


        System.out.println(odd_num);
        System.out.println(even_num);


        System.out.println("sum = "+(odd_num+even_num));
    }

}