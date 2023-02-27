class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums == null) {
            return false;
        }

        Arrays.sort(nums);

        int left = 0;
        int right = left+1;

        while (left< right && right<nums.length) {
            if(nums[left] == nums[right]) {
                return true;
            }
            else {
                left++;
                right++;
            }
        }
        return false;

    }
}
