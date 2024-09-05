import java.util.*;
public class conc {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
        }
        System.out.println(ans);
    }
    
}