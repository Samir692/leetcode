class FindSingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int res = 0;
        for(int n : nums){
            res ^= n;
        }

        return res;
        
    }
}
