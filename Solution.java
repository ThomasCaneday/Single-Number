class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int output = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
            }
            if(count == 1) {
                output = nums[i];
            }
            else{
                count = 0;
            }
        }
        return output;
    }
}
