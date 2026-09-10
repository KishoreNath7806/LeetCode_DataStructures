class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(containsEven(nums[i])){
                count = count + 1;
            }
        }
        return count;

    }
    static boolean containsEven(int num){
        int no_of_digit = 0;
        while(num > 0){
            no_of_digit = no_of_digit + 1;
            num = num / 10;
        }
        if(no_of_digit % 2 == 0){
            return true;
        }
        return false;
    }
}