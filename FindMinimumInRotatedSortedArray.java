class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int res = 0;

        int left = 0, right = nums.length-1;

        while(left < right){
            int mid = (left+right)/2;

            if(nums[mid] > nums[left]){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        
    }
}
