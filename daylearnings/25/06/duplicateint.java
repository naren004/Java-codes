import java.util.*;
public class duplicateint {

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for (int i = 0; i<a; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.toString(arr);
        System.out.println(arr);
        String narr[] = new String();
        for (int i = 0; i < arr.length; i++) {
            int at=arr[i];
            if(narr.indexOf(at)<0){

            }
        } 
    }
}
