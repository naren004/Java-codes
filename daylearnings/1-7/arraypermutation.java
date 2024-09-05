// import java.util.*;
// public class arraypermutation {
//     public static void main(String[] args) {
//         int[] num = {5,0,1,2,3,4};
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 0; i < num.length; i++) {
//             list.add(num[num[i]]);
//         }
//         System.out.println(list);
//     }
// }



import java.util.*;
public class arraypermutation {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,4,7,4,1,6};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[arr[i]]);
        }
        System.out.println(list);
    }
}