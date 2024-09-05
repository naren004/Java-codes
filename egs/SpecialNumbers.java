import java.util.*;
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // Arrays.sort(a);
        // System.out.println("after sorting\n");
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        System.out.println("repated element");
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}