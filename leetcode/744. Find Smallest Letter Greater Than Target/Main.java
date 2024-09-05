public class Main {
    public static void main(String[] args) {
         char[] letters = {'c','f','j'};
         char target = 'c';
        char ans = search(letters , target);
        System.out.println(ans);
    }
    static char search(char[] letters , char target){
         int start = 0;
         int end = letters.length - 1; // 2 // 0
         while (start <= end) {
            int mid = start + (end - start) / 2;   // 1 // 1
            if (target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
         }
        return letters[start % letters.length];
    }
}