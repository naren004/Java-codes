// public class substring {
//     public static void main(String[] args) {
//         String s ="abcac";
//         int n=11;

//         int len=s.length();
//         // System.out.println(len);
//         int c=0;
//         for (int i = 0; i < len; i++) {
//             if (s.charAt(i) == 'a'){
//                 c++;
//             }
//         }
//         c = (n/len) * c;
//         int rem = n%len;
//         for (int i = 0; i < rem; i++) {
//             if(s.charAt(i) == 'a'){
//                 c++;
//             }
//         }
//         System.out.println(c);
//     }
// }













public class substring {

    public static void main(String[] args) {
        String s = "devaseker";  //devasekerdevasekerdevase
        int len =s.length();
        int n = 24;
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'e'){
                c++;
            }
        }
        c= (n/len) * c;
        int rem = n%len;
        for (int i = 0; i < rem; i++) {
            if(s.charAt(i) == 'e'){
                c++;
            }
        }
        System.out.println(c);
    }
}