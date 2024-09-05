// import java.util.*;
// class bsa{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int target = sc.nextInt();
//         int[][] mat={
//             {05,15,25,35},
//             {45,55,65,75},
//             {85,86,87,88},
//             {89,90,91,92}
//         };
//         int[] ans = search(mat,target);
//         System.out.println(Arrays.toString(ans));
//         sc.close();
//     }
//     static int[] search(int[][] mat,int target){
//         int r=0;
//         int c=mat.length - 1;
//         while(r <= mat.length && c >= 0){
//             if(mat[r][c] == target){
//                 return new int[]{r,c};
//             }
//             if(mat[r][c] < target){
//                 r++;
//             }else{
//             c--;
//             }
//         }
//             return new int[] {-1,-1};
//     } 
// }

import java.util.*;
public class bsa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr={
        {5,15,25,35},
        {45,55,65,75},
        {85,86,87,88},
        {89,90,91,92}
        };
        System.out.println(Arrays.toString(call(arr,n)));
    }
    static int[] call(int[][] arr,int target){
        int r = 0;
        int c = arr.length-1;
       while (r <= arr.length && c >= 0) {
        if(arr[r][c] == target){
            return new int[]{r,c};
        }
        if(arr[r][c] < target){
            r ++;
        }
        else{
            c --;
        }
       }
       return new int[]{-1,-1};
    }}