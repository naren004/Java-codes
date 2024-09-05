class Solution {
    public int findNumbers(int[] nums) {
        int c=0;    
        for(int num:nums){
            if(even(num)){
                c++;
            }
        }
        return c;
    }
    static boolean even(int num){
        int numsof=dig(num);
        if(numsof % 2 == 0){
            return true;
        }
        return false;
    }
    static int dig(int num){
        if(num < 0){
            num = num *-1;
        }
        if (num == 0 ){

            return 1;
        }
        int c=0;
        while(num>0){
            c++;
            num /=10;
        }
        return c;
    }
}